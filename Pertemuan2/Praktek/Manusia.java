/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radik
 */
public class Manusia{
    private String nama;
    private boolean PunyaTV;

    public Manusia(){

    }

    public Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return this.nama;
    }

    public void beliTV(TV tiviku){
        PunyaTV = true;
    }

    public void jualSemuaTV(){
        PunyaTV = false;
    }

    public boolean cekTV(){
        return PunyaTV;
    }
}