/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Dosen extends Mahasiswa{
    
    public Dosen (){
    };
    
    @SuppressWarnings("empty-statement")
    public void InputUtm (String i, String p, int j, int b, String c){
        dosen.add(i);
        switch (j) {
            case 1 -> {
                dosen.add(matkul_utm.get(1) + " Jam "+ p);
                matkul_utm.set(1, "1.Pemograman Berorentasi Object"+ " Jam " + p);
            }
            case 2 -> {
                dosen.add(matkul_utm.get(2) + " Jam "+ p);
                matkul_utm.set(2, "2.Dasar Pemograman" + " Jam " + p);
            }
            case 3 -> {
                dosen.add(matkul_utm.get(3) + " Jam "+ p);
                matkul_utm.set(3, "3.Rekayasa Perangkat Lunak"+ " Jam " + p);
            }
            default ->  {
            }
        };
        switch (b) {
            case 11 -> {
                dosen.add(matkul_tam.get(0) + " Jam "+ c);
                matkul_tam.set(1, "11.Sistem Operasi"+ " Jam " + c);
            }
            case 12 -> {
                dosen.add(matkul_tam.get(1) + " Jam "+ c);
                matkul_tam.set(2, "12.Basis Data"+ " Jam " + c);
            }
            case 13 -> {
                dosen.add(matkul_tam.get(2) + " Jam "+ c);
                matkul_tam.set(3, "13.Data Mining"+ " Jam " + c);
            }
            default ->  {
                
                }
        };

        
    };
    public void cetakSemua (){
        System.out.println(dosen.get(0));
            System.out.println("Mengampu: ");
            System.out.println(dosen.get(1));
            System.out.println(dosen.get(2));
    };
    
    public void Utmatkul (){
        System.out.println("Silakan Pilih Matkul Utama 1");
        System.out.println("Mata Kuliah Utama" + matkul_utm);
    };
    public void Tamtmatkul (){
        System.out.println("Silakan Pilih Matkul Tambahan 1");
        System.out.println("Mata Kuliah Tambahan" + matkul_tam);
    };
    
    

}