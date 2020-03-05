/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P3;

/**
 *
 * @author KomDas
 */
public class Mahasiswa {
    private String nim,nama;
    //method mutator
    public void setNim(String nim) {
        this.nim=nim;
    }
    public void setNama(String nama) {
        this.nama=nama;
    }
    //method acessor
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    
    //method latihan nomor 2
    public void tampilkanData(){
        System.out.println("==Data==");
        System.out.println("Nim : "+ nim);
        System.out.println("Nama : "+ nama);
    }
    
    public static void main(String args[]){
        Mahasiswa obj=new Mahasiswa();
        obj.setNim("175410039");
        obj.setNama("Ferdi Dirgantara");
        System.out.println("==Data==");
        System.out.println("Nim : "+ obj.getNim());
        System.out.println("Nama : "+ obj.getNama());
        System.out.println("=======Tampil data untuk Latihan no 2=======");
        obj.tampilkanData();    //Penggunaan method tampilkanData
    }
}
