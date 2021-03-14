/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
class matematika{
      int hasil;

      public void tambah(int a, int b){
            hasil = a + b;
            System.out.println("Pertambahan :" + a + "+" + b + "=" + hasil);
      }
      public void kurang(int a, int b){
            hasil = a - b;
            System.out.println("Pengurangan :" + a + "-" + b + "=" + hasil);
      }
      public void kali(int a, int b){
            hasil = a * b;
            System.out.println("Perkalian   :" + a + "*" + b + "=" + hasil);
      }
      public void bagi(int a, int b){
            hasil = a / b;
            System.out.println("Pembagian  :" + a + "/" + b + "=" + hasil);
      }
}