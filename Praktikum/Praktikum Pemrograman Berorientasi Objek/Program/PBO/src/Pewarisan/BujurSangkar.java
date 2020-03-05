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
public class BujurSangkar extends Bentuk {
    private double sisi;
    BujurSangkar(double sisi, String warna){
        super(warna);
        this.sisi=sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double hitungLuas(){
        return sisi*sisi;
    }
    public void printInfo(){
        System.out.println("Bujursangkar berwarna " + super.getWarna() + ", luas = " + hitungLuas());
    }
}
