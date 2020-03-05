/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1;

/**
 *
 * @author KomDas
 */
public class ObyekHandphone {
    public static void main(String[] args){
        Handphone hp1 = new Handphone();
        hp1.setHP("iPhone 5s", 8);
        hp1.tampil();
        Handphone hp2 = new Handphone();
        hp2.setHP("Samsung Note 10", 12);
        hp2.tampil();
    }
}
