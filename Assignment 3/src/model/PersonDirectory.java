/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dhruvil
 */
public class PersonDirectory {
    public ArrayList<Person> person;
        
    public PersonDirectory(){
            this.person = new ArrayList<Person>();
            
        }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    
    
    public Person addNewPerson(){
        Person newP = new Person();
        person.add(newP);
        return newP;
    }
    
}
