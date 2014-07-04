/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sstolniceanu
 */
public abstract class PredicatesFilter {
            
    public static <T> List<T> filter(List<? extends T> list, Predicate<? super T> predicate){
        
       List<T> finalList= new ArrayList<>();
       
       for(T element : list){
           
           if(predicate.match(element))
                finalList.add(element);
        
       }
       
       return finalList;
        
    }
    
}
