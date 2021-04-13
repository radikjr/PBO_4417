/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Vehicle {
    public double speed;
    public String color;

    public Vehicle() {
        speed = 0;
        color = "orange";
    }

    public Vehicle(double kecepatan, String warna){
        speed = kecepatan;
        color = warna;
    }

    public void goStraight(){
        System.out.println("Majuuu");
        speed = speed + 10;
    }

    public void turnLeft(){
        System.out.println("Belok Kiri");
    }

    public void turnRight(){
        System.out.println("Belok Kanan");
    }
}