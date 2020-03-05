/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5.hp;

/**
 *
 * @author FERGA
 */
public class spekHp {
    String namaHP;
    int camera;
    int storage;
    
    public void setHP(String namaHP, int camera, int storage){
        this.namaHP = namaHP;
        this.camera = camera;
        this.storage = storage;
    }
    
    public void tampil(){
        System.out.println("Nama HP : " + namaHP);
        System.out.println("Kamera Belakang : " + camera + " MP");
        System.out.println("Penyimpanan : " + storage + " GB");
    }
    
}
