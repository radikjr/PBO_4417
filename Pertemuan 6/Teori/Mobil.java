/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Mobil {
    // field
    public int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";
    
    Mobil(){
        
    }
    
    public Mobil(int sizeEng,String lcPlate){
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }
    
    public int getSizeOfEngine(){
        return sizeofEngine;
    }
    
    public String getLicencePlate(){
        return licencePlate;
    }
    
}
