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
public class PredicateMatchName {
    
    private String name;
    
    public PredicateMatchName (String name){
        this.name = name;
    }
    
    public boolean match(Person personObj){
        String nameObj;
        nameObj = personObj.getName();
        nameObj = nameObj.toLowerCase();
        nameObj = nameObj.replaceAll("\\s+", "");
        this.name = this.name.toLowerCase();
        this.name = this.name.replace("\\s", "");
        return this.name.equals(nameObj);
    }
}
