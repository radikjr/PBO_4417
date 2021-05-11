/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Mahasiswa extends Nilai {
    String PBO, DP, RPL, SO, BD, DM; 
    int A, B, C, total;
    double utm = 0.6;
    double tam = 0.4;
    public Mahasiswa (){
    };
    
    
    @SuppressWarnings("empty-statement")
    public void InputMtMhs (String i, int j, int d, int x){
        mhs.add(i);
        switch (j) {
            case 1 -> {mhs.add(matkul_utm.get(1));
                     PBO = i;
            }
            case 2 -> {mhs.add(matkul_utm.get(2));
                     DP = i;
            }
            case 3 -> {mhs.add(matkul_utm.get(3));
                     RPL = i;
            }
            default -> {
            }
        };
        switch (d) {
            case 1 -> {mhs.add(matkul_utm.get(1));
                      PBO = i;
            }
            case 2 -> {mhs.add(matkul_utm.get(2));
                      DP = i;
            }
            case 3 -> {mhs.add(matkul_utm.get(3));
                      RPL = i;
            }
            default -> {
            }
        };
        switch (x) {
            case 11 -> {mhs.add(matkul_tam.get(0));
                        SO = i;
                        break;
            }
            case 12 -> {mhs.add(matkul_tam.get(1));
                        BD = i;
                        break;
            }
            case 13 -> {mhs.add(matkul_tam.get(2));
                        DM = i;
                        break;
            }
            default -> {
            }
        };
        
    };
    
    @SuppressWarnings("empty-statement")
    public void CetaMhsFromMatkul(int v){
        switch (v) {
            case 1 -> {System.out.println(matkul_utm.get(1) +" : " + PBO);
            }
            case 2 -> {System.out.println(matkul_utm.get(2) +" : " + DP);
            }
            case 3 -> {System.out.println(matkul_utm.get(3) +" : " + RPL);
            }
            case 11 -> {System.out.println(matkul_tam.get(1) +" : " + SO);
            }
            case 12 -> {System.out.println(matkul_tam.get(2) +" : " + BD);
            }
            case 13 -> {System.out.println(matkul_tam.get(3) +" : " + DM);
            }
            default -> {
            }
        };      
    };
    
    public void cetmhsMat (){
        System.out.println(mhs.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mhs.get(1));
            System.out.println(mhs.get(2));
            System.out.println(mhs.get(3));
    };
    
    public void cetmhsNilai (){
        System.out.println(mhs.get(0));
            System.out.println("Mengikuti Matkul: ");
            System.out.println(mhs.get(1) +" Nilai: " + nilaimhs.get(0));
            System.out.println(mhs.get(2)+" Nilai: " + nilaimhs.get(1));
            System.out.println(mhs.get(3)+" Nilai: " + nilaimhs.get(2));
            System.out.println("Nilai Akhir Rata2: ");
            A = nilaimhs.get(0);
            B = nilaimhs.get(1);
            C = nilaimhs.get(2);
            total = (int) (A * utm + B * utm + C * tam);
            System.out.println(total);
    };
    
    public void MatkulUtm (){
        System.out.println("Silakan Pilih Matkul Utama 2");
        System.out.println("Mata Kuliah Utama" + matkul_utm);
    };
    public void MatkulTam (){
        System.out.println("Silakan Pilih Matkul Tambahan 1");
        System.out.println("Mata Kuliah Tambahan" + matkul_tam);
    };
}