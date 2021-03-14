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
public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public TV(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void asd(){
        System.out.println(" tv1's channel is ");
    }
    
    public void setChannel( int newChannel ){
        if (newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
        else{
            System.out.println("=======Channel Not Ready, Channel Between 1 to 120======");
        }
    }
    
    public void setVolume(int newVolume){
        if (newVolume < 1 && newVolume > 7){
            System.out.println("======Volume Not Ready, Volume Between 1 to 7=======");
        }
        else{
            volumeLevel = newVolume;
        }
    }
    
    public void channelUP(){
        if (channel >120) {
            System.out.println("channel tidak ada");
        } else {
            channel++;
        }
    }
        
    public void channelDOWN(){
        if (channel <1) {
            System.out.println("channel tidak ada");
        } else {
            channel--;
        }
    }
    
    public void volumeUP(){
        if (volumeLevel >7) {
            System.out.println("volume tidak ada");
        } else {
            volumeLevel++;
        }
    }
    
     public void volumeDOWN(){
        if (volumeLevel <1) {
            System.out.println("volume tidak ada");
        } else {
            volumeLevel--;
        }
    }
}

