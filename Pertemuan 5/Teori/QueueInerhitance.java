
import java.util.Queue;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class QueueInerhitance {
    public static void main(String args[]){
        Balon balon = new Balon();
        System.out.println(balon.sisaBalon());
        balon.tambahBalon("Merah");
        balon.tambahBalon("Kuning");
        balon.tambahBalon("Hijau");
        balon.tambahBalon("Ungu");
        System.out.println(balon.sisaBalon());
 
        balon.balonPecah(3);
        System.out.println(balon.sisaBalon());
      }        
}

class Toko_Balon {
      Queue<String> balon = new LinkedList<String>();
 
      public Toko_Balon(){
 
      }
      public void setBalon(Queue<String> balon) {
            this.balon = balon;
      }
      public Queue<String> getBalon(){
            return this.balon;
      }
}

class Balon extends Toko_Balon {
      public void tambahBalon(String balon){
            super.getBalon().add(balon);
      }
      public void balonPecah(int index){
            System.out.println(super.getBalon().poll());
      }
      public Queue<String> sisaBalon(){
            return super.getBalon();
      }
} 