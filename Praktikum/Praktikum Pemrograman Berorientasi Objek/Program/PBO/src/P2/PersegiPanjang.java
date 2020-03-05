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
public class PersegiPanjang {
    double panjang;
    double lebar;
    
    public void setPanjangLebar(double panjang, double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public double luas(){
        double luas;
        luas=panjang*lebar;
        return(luas);
    }
    public double keliling(){
        double keliling;
        keliling=2*(panjang+lebar);
        return(keliling);
    }
    public void tampil(){
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}
