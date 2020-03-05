/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P6;

/**
 *
 * @author KomDas
 */
public class Pegawai {
    private String nama;
    private String jabatan;
    private int gaji;
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public long getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji= gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetakPegawai(){
        System.out.println("");
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Gaji Pokok \t:" + this.gaji);
    }
}
