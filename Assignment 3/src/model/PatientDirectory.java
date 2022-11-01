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
public class PatientDirectory {
    public ArrayList<Patient> ptDirectory;
    
    public PatientDirectory(){
            this.ptDirectory = new ArrayList<Patient>();
            
        }
    
    public ArrayList<Patient> getPtDirectory() {
        return ptDirectory;
    }

    public void setPtDirectory(ArrayList<Patient> ptDirectory) {
        this.ptDirectory = ptDirectory;
    }
    
    public Patient addNewPatient(Person person,String username,String pass){
        Patient newPat = new Patient(person, username, pass);
        ptDirectory.add(newPat);
        return newPat;
    }
    
    public void deletePatient(Patient pt){
        ptDirectory.remove(pt);
    }
    
   
    
}
