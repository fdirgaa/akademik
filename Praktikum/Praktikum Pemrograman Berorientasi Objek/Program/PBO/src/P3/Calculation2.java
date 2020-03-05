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
public class Calculation2 {
    private int a,b;
    private double c,d;
    void sum(int a,int b) {
        System.out.println(a+b);
    }
    void sum(double c,double d) {
        System.out.println(c+d);
    }
    
    //Latihan nomor 1
    void sum(int a, double b, double c){
        System.out.println(a+b+c);
    }
      
    public static void main(String args[]){
        Calculation2 obj=new Calculation2();
        obj.sum(10.5,10.5);
        obj.sum(20,20);
        obj.sum(20, 11.55, 10.4);     //Contoh Latihan nomor 1
    }
}
