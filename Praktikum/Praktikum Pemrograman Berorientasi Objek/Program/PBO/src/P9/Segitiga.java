/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P9;

/**
 *
 * @author KomDas
 */
public class Segitiga extends Bentuk {
    public Segitiga(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public String getBentuk(){
        return "bentuk segitiga";
    }
    public int HitungLuas(){
        return (panjang*lebar)/2;
    }
}
