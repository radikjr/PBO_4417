
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Demo{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Dosen dos = new Dosen();
       System.out.println("Untuk Dosen: ");
       Scanner sc = new Scanner(System.in);
       System.out.println("Nama:");
       String i = sc.nextLine();
       dos.Utmatkul();
       System.out.println("Nomor Matkul Utama Yg Diampu: :");
       int j = sc.nextInt();
       System.out.println("Jam Matkul Utama:");
       String p = sc.next();
       dos.Tamtmatkul();
       System.out.println("Nomor Matkul Tambahan Yg Diampu: :");
       int b = sc.nextInt();
       System.out.println("Jam Matkul Tambahan:");
       String c = sc.next();
       dos.InputUtm(i, p, j, b, c);
       dos.cetakSemua();
       System.out.println("Untuk Mahasiswa: ");
       System.out.println("Nama:");
       String z = sc.next();
       dos.MatkulUtm();
       System.out.println("Nomor Matkul Utama yg Di Ambil: :");
       int f = sc.nextInt();
       System.out.println("Nomor Matkul Utama yg Di Ambil: :");
       int g = sc.nextInt();
       dos.MatkulTam();
       System.out.println("Nomor Matkul Tambahan yg Di Ambil: :");
       int h = sc.nextInt();
       dos.InputMtMhs(z, f, g, h);
       dos.cetmhsMat();
       System.out.println("Untuk Dosen: ");
       System.out.println("Untuk Melihat Matkul Yg Di Ikuti Mhs");
       System.out.println("Silakan Masukan Kode Matkul: ");
       int n = sc.nextInt();
       dos.CetaMhsFromMatkul(n);
       System.out.println("Menginput Nilai Mahasiswa Berikut:");
       dos.cetmhsMat();
       System.out.println("Silakan Input Nilai Matkul 1: ");
       int o = sc.nextInt();
       System.out.println("Silakan Input Nilai Matkul 2: ");
       int d = sc.nextInt();
       System.out.println("Silakan Input Nilai Matkul 3: ");
       int l = sc.nextInt();
       dos.InputNilaiMhs(o, d, l);
       dos.cetmhsNilai();
       
       
        
        
    }
    
}