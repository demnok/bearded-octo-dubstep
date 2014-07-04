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
public class PredicateMatchSalary {
    
    private final Integer salary;
    
    public PredicateMatchSalary(int salary){
        this.salary = salary;
    }
    
    public boolean match(Employee personObj){
        int salaryObj = personObj.getSalary();
        return this.salary.equals(salaryObj);
    }
}
