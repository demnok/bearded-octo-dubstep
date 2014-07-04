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
public class PredicateAnd<T> implements Predicate<T> {
    
    List<Predicate<? super T>> predicates;
    
    public PredicateAnd (Predicate<? super T> ... predicates){
        
        this.predicates = new ArrayList<>();
        
        this.predicates.addAll(Arrays.asList(predicates)); //x

    }
    
    public PredicateAnd (List<Predicate<? super T>> predicates){
        
        this.predicates = predicates;
        
    }
    
    public PredicateAnd (Predicate<? super T> predicateOne, Predicate<? super T> predicateTwo){
        
        this.predicates = new ArrayList<>();
        this.predicates.add(predicateOne);
        this.predicates.add(predicateTwo);
        
    }
    
    @Override
    public boolean match(T object){
        for(Predicate<? super T> predicate : predicates){
            
            if(!predicate.match(object)){
                return false;
            }
            
        }
        
        return true;
        
    }
}
