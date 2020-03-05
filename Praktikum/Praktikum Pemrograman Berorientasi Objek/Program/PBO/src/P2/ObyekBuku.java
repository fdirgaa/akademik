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
public class ObyekBuku {
    public static void main(String[] args){
         Buku buku1 = new Buku();
         buku1.setBuku("PBO","Dosen1","Akakom", 75000, 200);
         buku1.tampil();
         
         //Awal Latihan
         Buku buku2 = new Buku();
         buku2.setBuku("PAW","Dosen2","Akakom", 70000, 180);
         buku2.tampil();
         
         Buku buku3 = new Buku();
         buku3.setBuku("Basis Data","Dosen3","Akakom", 80000, 300);
         buku3.tampil();
         //Akhir Latihan
     }
}
