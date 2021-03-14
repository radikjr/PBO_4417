/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author radik
 */
public class TestTV {
    public static void main(String[] args) {
//        TV asd = new TV();
//        asd.asd();
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(50);
        tv1.setVolume(5);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUP();
        tv2.channelUP();
        tv2.volumeUP();
        
        System.out.println(" tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println(" tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
