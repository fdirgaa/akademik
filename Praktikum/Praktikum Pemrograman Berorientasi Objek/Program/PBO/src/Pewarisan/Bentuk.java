/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author FERGA
 */
public class Bentuk {
    private String warna;
    public Bentuk(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void printInfo(){
        System.out.println("Bentuk Warna " + warna);
    }
}
