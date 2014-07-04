/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment;

/**
 *
 * @author sstolniceanu
 */
public class PredicateNot<T> implements Predicate<T> {
    
  Predicate<? super T> predicate;
  
  public PredicateNot(Predicate<? super T> predicate){
      this.predicate = predicate;
  }
  
  @Override
  public boolean match(T object)
  {
      return !predicate.match(object);
  }
}
