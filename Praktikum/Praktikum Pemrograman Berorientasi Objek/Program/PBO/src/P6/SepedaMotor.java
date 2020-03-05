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
public class SepedaMotor {
    private String nama;
    private String warna;
    private int kecepatan;
    private String noPlat;
    private String bbm;
    
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public long getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan= kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    
    public String getBBM() {
        return noPlat;
    }

    public void setBBM(String bbm) {
        this.bbm = bbm;
    }
    
    public void cetakSepedaMotor(){
        System.out.println("");
        System.out.println("Nama Motor : " + this.nama);
        System.out.println("Warna Motor : " + this.warna);
        System.out.println("Kecepatan :" + this.kecepatan + "km/jam");
        System.out.println("No Plat : "+this.noPlat);
        System.out.println("Bahan Bakar : "+this.bbm);
    }    
}
