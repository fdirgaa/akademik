/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author FERGA
 */
public class Lingkaran {
    final double phi = 3.14;
    double jari;
    
    public void setJari(double jari0){
        this.jari=jari0;
    }
    
    public double jari(){
        return(jari);
    }
    
    public double luas(){
        double luas0;
        luas0 = phi * jari * jari;
        return(luas0);
    }
    
    public void tampil(){
        System.out.println("Jari-jari : " + jari);
        System.out.println("Luas : " + luas());
    }
}
