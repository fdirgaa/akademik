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
public class TestAbstrak2 {
    public static void cetakLuasBentuk(Bentuk btk){
        System.out.println(btk.getBentuk() + " dengan luas : " + btk.HitungLuas());
    }
    public static void main(String[] args){
        BujurSangkar bs = new BujurSangkar(10,20);
        Segitiga st = new Segitiga(5,10);
        cetakLuasBentuk(bs);
        cetakLuasBentuk(st);
        
    }
}
