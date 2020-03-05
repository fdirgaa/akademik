/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author FERGA
 */
public class Mahasiswa {
    String nama;
    String jk;
    String jurusan;
    int nim;
    int umur;
    public void setMahasiswa(String nama, String jk, String jurusan, int nim, int umur){
         this.nama=nama;
         this.jk=jk;
         this.jurusan=jurusan;
         this.nim=nim;
         this.umur=umur;
     }
     
     public void tampil(){
         System.out.println("Nama : " + nama);
         System.out.println("NIM : " + nim);
         System.out.println("Jurusan : " + jurusan);
         System.out.println("Jenis Kelamin : " + jk);
         System.out.println("Umur : " + umur);
     }
}
