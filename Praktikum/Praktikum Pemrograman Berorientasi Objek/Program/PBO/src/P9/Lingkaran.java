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
public class Lingkaran extends Bentuk {
    public static void cetakLuasBentuk(Bentuk btk){
        System.out.println(btk.getBentuk() + " dengan luas : " + btk.HitungLuas());
    }
    public Lingkaran(){
        System.out.println("Kelas Lingkaran turunan kelas abstrak bentuk");
    }
    public String getBentuk(){
        return "Bentuk Lingkaran";
    }
    public int HitungLuas(){
        return (22/7) * (panjang*lebar);
    }
    public static void main(String[] args){
        Bentuk geometri = new BujurSangkar(10,15);
        cetakLuasBentuk(geometri);
    }
}
