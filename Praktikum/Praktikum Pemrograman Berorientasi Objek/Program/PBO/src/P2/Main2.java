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
public class Main2 {
    public static void main(String[] args){
        int i; 
        Lingkaran[] a;
        a = new Lingkaran[5];
        
        for(i=0;i<5;i++){
            a[i] = new Lingkaran();
        }
        a[0].setJari(00.00);
        a[1].setJari(10.00);
        a[2].setJari(20.00);
        a[3].setJari(30.00);
        a[4].setJari(40.00);
        for(i=0;i<5;i++){
            System.out.println("Lingkaran ke: "+i);
            a[i].tampil();
        }
    }
}
