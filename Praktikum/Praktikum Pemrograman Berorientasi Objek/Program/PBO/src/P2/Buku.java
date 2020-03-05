/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P2;

/**
 *
 * @author KomDas
 */
class Buku {
     String judul;
     String penulis;
     String penerbit;
     int harga;
     int halaman;
     
     public void setBuku(String judul, String penulis, String penerbit, int harga, int halaman){
         this.judul=judul;
         this.penulis=penulis;
         this.penerbit=penerbit;
         this.harga=harga;
         this.halaman=halaman;
     }
     
     public void tampil(){
         System.out.println("Judul buku : " + judul);
         System.out.println("Penulis buku : " + penulis);
         System.out.println("Penerbit buku : " + penerbit);
         System.out.println("Harga buku : " + harga);
         System.out.println("Jumlah halaman : " + halaman);
     }
}
