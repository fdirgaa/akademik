/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P14;

/**
 *
 * @author KomDas
 */
public class MyClass {
    public MyClass(){
        new Thread(){
            public void run(){
                System.out.println("Threat dijalankan ");
            }
        }.start();
    }
    
    public static void main(String[] args){
        new MyClass();
    }
}
