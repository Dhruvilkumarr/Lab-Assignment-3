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
public class City {
    public ArrayList<Community> commDirectory;
    public String city;

    public City(){
            this.commDirectory = new ArrayList<Community>();
        }
    
    
    public Community addNewComm(){
        Community com = new Community();
        commDirectory.add(com);
        return com;
    }
    
    public void deleteCom(Community comm){
        commDirectory.remove(comm);
    }
    
    public ArrayList<Community> getCommDirectory() {
        return commDirectory;
    }

    public void setCommDirectory(ArrayList<Community> commDirectory) {
        this.commDirectory = commDirectory;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
