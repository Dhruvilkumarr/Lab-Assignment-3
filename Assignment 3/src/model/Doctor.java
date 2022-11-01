/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dhruvil
 */
public class Doctor {
    Person person;
    public String userd;
    public String passd;
    public String degree;
    public int experience;
    public boolean avail;
    
    public Doctor(Person person, String userd, String passd) {
        this.person = person;
        this.userd = userd;
        this.passd = passd;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUserd() {
        return userd;
    }

    public void setUserd(String userd) {
        this.userd = userd;
    }

    public String getPassd() {
        return passd;
    }

    public void setPassd(String passd) {
        this.passd = passd;
    }
    

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }
    
    @Override
    public String toString(){
        return userd;
        
    }
}
