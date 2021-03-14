/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
class Mobil {
      String warna;
      int tahunProduksi;
      boolean hidup;
      int gigi;

      public void hidupkanMobil(){
            hidup = true;
      }
      public void matikanMobil(){
            hidup = false;
      }
      public void ubahGigi(int gigiBaru){
            gigi = gigiBaru;
      }
}
