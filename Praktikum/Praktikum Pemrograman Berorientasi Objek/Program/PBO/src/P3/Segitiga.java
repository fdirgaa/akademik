/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P3;

/**
 *
 * @author KomDas
 */
public class Segitiga {
    double alas,tinggi,luas;
    
    void samaSisi(double alas, double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
        this.luas= 0.5 * alas * tinggi;
    }
    void tampilkan(){
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Segitiga = " + luas);
    }
    
    public static void main(String[] args){
        Segitiga st = new Segitiga();
        st.samaSisi(10, 12);
        st.tampilkan();
    }
}
