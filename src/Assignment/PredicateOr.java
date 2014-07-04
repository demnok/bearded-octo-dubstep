/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sstolniceanu
 */
public class PredicateOr<T> implements Predicate<T> {
    
    List<Predicate<? super T>> predicates;
    
    public PredicateOr(Predicate<? super T> ... predicates){
        
        this.predicates = new ArrayList<>();
        
        this.predicates.addAll(Arrays.asList(predicates));
        
    }
    
    public PredicateOr(List<Predicate<? super T>> predicates){
        
        this.predicates = predicates;
        
    }
    
    public PredicateOr(Predicate<? super T> predicateOne, Predicate<? super T> predicateTwo){
        
        this.predicates = new ArrayList<>();
        this.predicates.add(predicateOne);
        this.predicates.add(predicateTwo);
        
    }
    
    @Override
    public boolean match(T object){
        
        for(Predicate<? super T> predicate : predicates){
            
            if(predicate.match(object))
                return true;
            
        }
        
        return false;
        
    }
}
