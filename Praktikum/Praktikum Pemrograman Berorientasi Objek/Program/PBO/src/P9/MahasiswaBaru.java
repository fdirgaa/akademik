/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P9;

/**
 *
 * @author KomDas
 */
public class MahasiswaBaru extends Mahasiswa {
    public MahasiswaBaru(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    public String isiBiodata(String nama, int nilai){
        return this.nama = nama; 
    } 
    public static void cetakMahasiswa(Mahasiswa mhs){
        System.out.println("Nama " + mhs.nama + ", nilai : " + mhs.nilai);
        System.out.println(mhs.registrasi());
        System.out.println(mhs.testMasuk());
    }
    public static void main(String[] args){
        MahasiswaBaru mb = new MahasiswaBaru("Ferdi", 90);
        cetakMahasiswa(mb);
    }
}
