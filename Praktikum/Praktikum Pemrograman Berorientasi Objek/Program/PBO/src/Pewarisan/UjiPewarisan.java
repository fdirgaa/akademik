/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author FERGA
 */
public class UjiPewarisan {
    public static void main(String[] args){
        BujurSangkar bs = new BujurSangkar(5, "Biru");
        Lingkaran l = new Lingkaran(7, "Merah");
        Silinder s = new Silinder(28, 10, "Hitam");
        bs.printInfo();
        l.printInfo();
        s.printInfo();
    }
}
