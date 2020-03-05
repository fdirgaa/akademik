/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P5.mahasiswa;

/**
 *
 * @author KomDas
 */
public class paket {
    String nama;
    int umur;
    public static void isiPaket(){
        System.out.println("Ini hasil import");
    }
    
    public void setData(int umur, String nama){
        this.umur = umur;
        this.nama = nama;
    }
    
    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
