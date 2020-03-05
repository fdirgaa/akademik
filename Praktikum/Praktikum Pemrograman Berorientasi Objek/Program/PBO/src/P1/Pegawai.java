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
class Pegawai {
    String nama;
    String jabatan;
    int umur;
    
    public void setPegawai(String nama, String jabatan, int umur){
        this.nama=nama;
        this.jabatan=jabatan;
        this.umur=umur;
    }
    
    public void tampil(){
         System.out.println("Nama Pegawai : " + nama);
         System.out.println("Jabatan  : " + jabatan);
         System.out.println("Umur : " + umur);
     }
}
