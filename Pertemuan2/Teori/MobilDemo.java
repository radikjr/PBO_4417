/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class MobilDemo {
      public static void main(String[] args){
	    Mobil mobilku = new Mobil();
            mobilku.warna = "Hitam";
            mobilku.tahunProduksi = 2003 ;

            mobilku.hidup = false;
            mobilku.gigi = 0;
            System.out.println("Warna:" + mobilku.warna);
            System.out.println("Tahun:" + mobilku.tahunProduksi);
            System.out.println("Hidup:" + mobilku.hidup);
            System.out.println("Gigi:" + mobilku.gigi);
            mobilku.hidupkanMobil();
            System.out.println("Hidup:" + mobilku.hidup);
            mobilku.ubahGigi(1);
            System.out.println("Gigi:" + mobilku.gigi);
      }
}