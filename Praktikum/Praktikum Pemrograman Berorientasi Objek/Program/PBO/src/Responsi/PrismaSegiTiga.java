/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Responsi;

/**
 *
 * @author KomDas
 */
public class PrismaSegiTiga extends SegiTiga {
    int tPrisma;
    double volume;
    public PrismaSegiTiga(int alas, int tinggi, int tPrisma){
        super(alas, tinggi);
        this.tPrisma = tPrisma;
    }
    public double hitungVolume(){
        volume = this.hitungLuas() * tPrisma;
        return volume;
    }
    
    public void tampilVolume(){
        System.out.println("Volume Prisma Segitiga : " + hitungVolume());
    }
}
