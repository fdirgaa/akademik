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
public class Truck extends Mobil {
    protected String spesifikasi;
    
    public Truck(String spesifikasi, int kec){
        super(kec);
        this.spesifikasi = spesifikasi;
        System.out.println(spesifikasi);
    }
    
    public Truck(int kecmaks, String namaken, String spesifikasi){
        super(kecmaks, namaken);
        this.spesifikasi = spesifikasi;
    }
    
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Gandengan : " + spesifikasi);
    }
    
    public void PrintInfoTruck(){
        System.out.println("Kecepatan Maksimal : " + kecmaks);
        System.out.println("Nama Kendaraan : " + namaken);
        System.out.println("Spesifikasi : " + spesifikasi);
    }
}
