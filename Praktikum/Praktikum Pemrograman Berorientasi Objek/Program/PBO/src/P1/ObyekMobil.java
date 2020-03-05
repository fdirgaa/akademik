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
public class ObyekMobil {
    public static void main(String[] args){
        Mobil mobilA = new Mobil();
        mobilA.setMobil("AB 3313 SY", "Biru", "Mitsubishi", 50);
        mobilA.tampil();
        mobilA.akselerasi();
        mobilA.belok();
        mobilA.rem();
        Mobil mobilB = new Mobil();
        mobilB.setMobil("AB 1234 AT", "Merah", "Toyota", 100);
        mobilB.tampil();
        mobilB.akselerasi();
        mobilB.belok();
        mobilB.rem();
    }
}
