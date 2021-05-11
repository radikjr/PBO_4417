/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
import java.util.ArrayList;

/**
 *
 * @author Black_Avous
 */
public abstract class HarapanKita {
        ArrayList  mhs = new ArrayList();
        ArrayList  dosen = new ArrayList();
        ArrayList<String>  matkul_utm = new ArrayList<>();
        ArrayList<String>  matkul_tam = new ArrayList<>();
        ArrayList<Integer>  nilaimhs = new ArrayList<>();
    
    public abstract void cetak(int i);
    public abstract void input(String i, int j);
}