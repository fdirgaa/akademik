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
class Buku {
     String judul;
     int harga;
     int halaman;
     
     Buku(String jdl, int hrg, int hlm){
         judul=jdl;
         harga=hrg;
         halaman=hlm;
     }
     
     Buku(){
         judul = "Rich Dad Poor Dad";
         harga = 80000;
         halaman = 235;
     }
     
     public void tampil(){
         System.out.println("Judul buku : " + judul);
         System.out.println("Harga buku : " + harga);
         System.out.println("Jumlah halaman : " + halaman);
     }
     
     public static void main(String[] args){
         Buku buku1 = new Buku();
         Buku buku2 = new Buku("Cashflow Quadran", 95000,320);
         
         buku1.tampil();
         buku2.tampil();
     }
}
