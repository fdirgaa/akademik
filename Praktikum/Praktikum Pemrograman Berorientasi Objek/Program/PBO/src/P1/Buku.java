/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1;

/**
 *
 * @author KomDas
 */
class Buku {
     String judul;
     int harga;
     int halaman;
     
     public void setBuku(String judul, int harga, int halaman){
         this.judul=judul;
         this.harga=harga;
         this.halaman=halaman;
     }
     
     public void tampil(){
         System.out.println("Judul buku : " + judul);
         System.out.println("Harga buku : " + harga);
         System.out.println("Jumlah halaman : " + halaman);
     }
}
