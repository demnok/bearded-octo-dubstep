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
public class Person {
    private final String name;
    private final String email;
    private final int age;
    public Person (String nameInput, String emailInput, int ageInput){
        name = nameInput;
        email = emailInput;
        age = ageInput;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString(){
        return name + " " + email + " " + age;  
    }
    
    
}


