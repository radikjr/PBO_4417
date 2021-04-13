/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
  
public class Car extends MotorVehicle {
    private boolean sabukPengaman;

    public Car(){
        super();
        sabukPengaman = false;
    }

    public Car(double kecepatan, String warna, int sizeEng, String lcPlate){
        super(kecepatan, warna, sizeEng, lcPlate);
        sabukPengaman = false;
    }

    public void setSabukPengaman(int sabuk){
        if (sabuk > 0) {
            sabukPengaman = true;
        }
    }

    public boolean getSabukPengaman(){
        return sabukPengaman;
    }

    public void getStraight(){
        System.out.println("Mobil Majuuu");
    }
}