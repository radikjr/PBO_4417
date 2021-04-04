
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class StackInerhitance {
    public static void main(String args[]){
            Balon balon = new Balon();
            System.out.println(balon.sisaBalon());
 
            balon.tambahBalon("Merah");
            balon.tambahBalon("Kuning");
            balon.tambahBalon("Hijau");
            System.out.println(balon.sisaBalon());
 
            balon.gantiBalon(2,"Ungu");
            System.out.println(balon.sisaBalon());
 
            balon.balonPecah();
            System.out.println(balon.sisaBalon());
      }
}
 
class Toko_Balon {
      Stack<String> balon = new Stack<String>();
 
      public Toko_Balon(){
 
      }
      public void setBalon(Stack<String> balon) {
            this.balon = balon;
      }
      public Stack<String> getBalon(){
            return this.balon;
      }
} 
 
class Balon extends Toko_Balon {
      public void tambahBalon(String balon){
            super.getBalon().push(balon);
      }
      public String balonPecah(){
            return super.getBalon().pop();
      }
      public void gantiBalon(int index,String balon){
            super.getBalon().set(index, balon);
      }
      public Stack<String> sisaBalon(){
            return super.getBalon();
      }
}
