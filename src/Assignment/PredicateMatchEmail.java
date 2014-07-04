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
public class PredicateMatchEmail implements Predicate<Person> {
    @Override
    public boolean match(Person personObj){
       String email;
       email = personObj.getEmail();
       return email.endsWith("@gmail.com");
    }
}

