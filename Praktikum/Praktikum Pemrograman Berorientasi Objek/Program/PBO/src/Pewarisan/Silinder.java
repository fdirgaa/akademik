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
public class Silinder extends Lingkaran {
    private double tinggi;
    Silinder(double tinggi, double radius, String warna){
        super(radius, warna);
        this.tinggi=tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double t){
        tinggi = t;
    }
    public double hitungVolume(){
        return 3.14 * super.getRadius() * super.getRadius() * tinggi;
    }
    public void printInfo(){
        System.out.println("Silinder berwarna " + super.getWarna() + ", volume = " 
                + hitungVolume());
    }
}
