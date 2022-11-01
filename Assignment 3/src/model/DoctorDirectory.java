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
public class DoctorDirectory {
    public ArrayList<Doctor> docDirectory;
    
    
    public DoctorDirectory(){
            this.docDirectory = new ArrayList<Doctor>();
        }
    
    public Doctor addNewDoctor(Person person,String username,String pass){
        Doctor newDoc = new Doctor(person, username, pass);
        docDirectory.add(newDoc);
        return newDoc;
    }
    
    public void deleteDoc(Doctor doc){
        docDirectory.remove(doc);
    }
    
    public ArrayList<Doctor> getDocDirectory() {
        return docDirectory;
    }

    public void setDocDirectory(ArrayList<Doctor> docDirectory) {
        this.docDirectory = docDirectory;
    }
    
}
