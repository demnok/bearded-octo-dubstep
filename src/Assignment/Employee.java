package Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sstolniceanu
 */
public class Employee extends Person {
    private final int salary;

    public Employee(String nameInput, String emailInput, int ageInput, int salaryInput) {
        super(nameInput, emailInput, ageInput);
        salary = salaryInput;
    }
    
     public int getSalary() {
        return salary;
    }
     
    @Override
    public String toString(){
        return super.toString() + " " +  salary;
    }
     
     
}
