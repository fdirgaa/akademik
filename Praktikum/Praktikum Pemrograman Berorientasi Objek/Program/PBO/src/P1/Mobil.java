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
class Mobil {
    String noPlat;
    String warna;
    String manufaktur;
    int kecepatan;
    
    public void setMobil(String noPlat, String warna, String manufaktur,int kecepatan){
        this.noPlat=noPlat;
        this.warna=warna;
        this.manufaktur=manufaktur;
        this.kecepatan=kecepatan;
    }
    
    public void tampil(){
        System.out.println("Nomor Plat : " + noPlat);
        System.out.println("Warna : " + warna);
        System.out.println("Manufaktur : " + manufaktur);
        System.out.println("Kecepatan : " + kecepatan + " km/h");
    }
    
    public void akselerasi(){
        System.out.println("Teks dari method akselerasi");
    }
    
    public void belok(){
        System.out.println("Teks dari method belok");
    }
    
    public void rem(){
        System.out.println("Teks dari method rem");
    }
}
