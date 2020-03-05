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
abstract class Bentuk {
    protected int panjang;
    protected int lebar;
    public String getBentuk(){
        return "bentuk dasar";
    }
    public abstract int HitungLuas();
}
