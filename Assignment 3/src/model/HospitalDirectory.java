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
public class HospitalDirectory {
    public ArrayList<Hospital> hospDirectory;
    
    public HospitalDirectory(){
            this.hospDirectory = new ArrayList<Hospital>();
        }
    
    public Hospital addNewHospital(Community community, String hname, int ratings){
        Hospital newHosp = new Hospital(community, hname, ratings);
        hospDirectory.add(newHosp);
        return newHosp;
    }
    
    public void deleteHosp(Hospital hosp){
        hospDirectory.remove(hosp);
    }
    
    public ArrayList<Hospital> getHospDirectory() {
        return hospDirectory;
    }

    public void setHospDirectory(ArrayList<Hospital> hospDirectory) {
        this.hospDirectory = hospDirectory;
    }
    
}
