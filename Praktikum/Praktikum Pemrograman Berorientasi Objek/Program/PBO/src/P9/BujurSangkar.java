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
public class BujurSangkar extends Bentuk {
    public BujurSangkar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public String getBentuk(){
        return "bentuk bujur sangkar";
    }
    public int HitungLuas(){
        return panjang * lebar;
    }
}
