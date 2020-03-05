/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Responsi;

import java.net.Socket;

/**
 *
 * @author KomDas
 */
public class SegiTiga {
    protected int alas, tinggi;
    protected double luas;
    SegiTiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungLuas(){
        luas = (alas * tinggi)/2;
        return luas;
    }
 
    public void tampilHasil(){
        System.out.println("Luas Segitiga : " + hitungLuas());
    }
}
