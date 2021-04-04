/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author radik
 */
public class ArrayList_Inerhitance {
      public static void main(String args[]){
            Balon balon = new Balon();
            System.out.println(balon.sisaBalon());
 
            balon.tambahBalon("Merah");
            balon.tambahBalon("Kuning");
            balon.tambahBalon("Hijau");
            System.out.println(balon.sisaBalon());
 
            balon.tambahBalon("Ungu");
            System.out.println(balon.sisaBalon());
 
            balon.balonPecah(1);
            System.out.println(balon.sisaBalon());
      }
}

class Toko_Balon {
      ArrayList<String> balon = new ArrayList<String>();

      public Toko_Balon(){

      }
      public void setBalon(ArrayList<String> balon) {
            this.balon = balon;
      }
      public ArrayList<String> getBalon(){
            return this.balon;
      }
} 
class Balon extends Toko_Balon {
      public void tambahBalon(String balon){
            super.getBalon().add(balon);
      }
      public String balonPecah(int index){
            return super.getBalon().remove(index);
      }
      public void gantiBalon(int index, String balon){
            super.getBalon().set(index, balon);
      }
      public ArrayList<String> sisaBalon(){
            return super.getBalon();
      }
}