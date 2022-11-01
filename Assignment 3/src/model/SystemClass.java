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
public class SystemClass {
    public ArrayList<Admin> adminDirectory;
    
    public SystemClass(){
            this.adminDirectory = new ArrayList<Admin>();
        }
    public Admin addNewAdmin(Person person,String username,String password){
        Admin newAdm = new Admin(person, username, password);
        adminDirectory.add(newAdm);
        return newAdm;
    }
    
    public ArrayList<Admin> getAdminDirectory() {
        return adminDirectory;
    }

    public void setAdminDirectory(ArrayList<Admin> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
    
}
