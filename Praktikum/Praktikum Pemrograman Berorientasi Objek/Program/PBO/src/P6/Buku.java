/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P6;

import P1.*;

/**
 *
 * @author KomDas
 */
class Buku {
     private String judul;
     private int harga;
     private int halaman;
     
     public void setBuku(String judul, int harga, int halaman){
         this.judul=judul;
         this.harga=harga;
         this.halaman=halaman;
     }
     
     public String getJudul(){
         return judul;
     }
     
     public int getHarga(){
         return harga;
     }
     
     public int getHalaman(){
         return halaman;
     }
     
     public void tampil(){
         System.out.println("Judul buku : " + judul);
         System.out.println("Harga buku : " + harga);
         System.out.println("Jumlah halaman : " + halaman);
     }
}
