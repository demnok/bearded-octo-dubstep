package Assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sstolniceanu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee employee1 = new Employee("numeprenume","adresa@gmail.com",20,3);
        Employee employee2 = new Employee("nume prenume","adresa@gmail.com",16,5);
        Employee employee3 = new Employee("altnumeprenume","adresa@gmail.com",19,5);
        Employee employee4 = new Employee("incaunnumeprenume","adresa@whatever.com",20,10);

        Person person4 = new Person("numeprenume","adresa@gmail.com",20);
        Person person3 = new Person("nume prenume","adresa@gmail.com",16);
        Person person2 = new Person("altnumeprenume","adresa@gmail.com",19);
        Person person1 = new Person("incaunnumeprenume","adresa@whatever.com",20);
        
        System.out.println(new PredicateMatchEmail().match(employee1));     
        System.out.println(new PredicateMatchEmail().match(employee4));
        
        List<Person> list = new ArrayList<>();
        
        list.add(person3);
        list.add(employee1);
        
        System.out.println(PredicatesFilter.filter(list, new PredicateNot<>(new PredicateMatchEmail())));
        System.out.println(PredicatesFilter.filter(list, new PredicateMatchEmail()));
        
        
    }
    
}
