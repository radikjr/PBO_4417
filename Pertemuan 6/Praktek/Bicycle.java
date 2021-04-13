/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Bicycle extends Vehicle{
    public Bicycle(){
        super();
    }

    public void ringBell(){
        System.out.println("Kring....Kring....");
    }

    public void goStraight(){
        System.out.println("Sepeda Majuuu");
        speed = speed + 15;
    }
}