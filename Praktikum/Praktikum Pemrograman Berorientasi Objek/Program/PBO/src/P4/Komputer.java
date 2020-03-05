/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P4;

/**
 *
 * @author KomDas
 */
public class Komputer {
    String namaKomputer, SSD;
    int ram;
    
    Komputer(){
        namaKomputer = "iMac";
        ram = 16;
        SSD = "1 TB";
    }
    
    Komputer(String nama, int jRam, String jSsd){
        namaKomputer = nama;
        ram = jRam;
        SSD = jSsd;
    }
    
    public void tampilKomputer(){
        System.out.println("===Informasi Komputer===");
        System.out.println("Nama Komputer\t: " + namaKomputer);
        System.out.println("RAM Komputer\t: " + ram + "GB");
        System.out.println("SSD Komputer\t: " + SSD);
        System.out.println("========================");
    }
    
    public static void main(String[] args){
        Komputer komp1 = new Komputer();
        Komputer komp2 = new Komputer("Asus",8,"512 GB");
        
        komp1.tampilKomputer();
        komp2.tampilKomputer();
    }
}
