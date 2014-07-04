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
public class PredicateMatchAge {
    
    private final Integer age;
    
    public PredicateMatchAge(int age){
        this.age = age;
    }
    
    public boolean match(Person personObj)
    {
        int ageObj;
        ageObj = personObj.getAge();
        return this.age.equals(ageObj) && (ageObj > 18);
    }
}
