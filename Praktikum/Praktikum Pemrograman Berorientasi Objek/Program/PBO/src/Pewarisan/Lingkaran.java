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
public class Lingkaran extends Bentuk {
    private double radius;
    Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double hitungLuas(){
        return 3.14 * (radius*radius);
    }
    public void printInfo(){
        System.out.println("Lingkaran berwarna " + super.getWarna() + ", luas = " 
                + hitungLuas());
    }
}
