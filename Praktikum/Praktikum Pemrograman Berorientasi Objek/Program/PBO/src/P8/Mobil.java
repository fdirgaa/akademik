/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P8;

/**
 *
 * @author KomDas
 */
public class Mobil {
    protected int kecmaks;
    protected String namaken;
    
    public Mobil(){
        System.out.println("Konstruktor Mobil");
    }
    
    public Mobil(int kecmaks){
        this.kecmaks = kecmaks;
        System.out.println("Kecepatan Maksimal Mobil = " + kecmaks);
    }
    
    Mobil(int kecmaks, String namaken){
        this.kecmaks = kecmaks;
        this.namaken = namaken;
    }
    
    public void PrintInfoMobil(){
        System.out.println("Kecepatan Maksimal : " + kecmaks);
        System.out.println("Nama Kendaraan : " + namaken);
    }
}
