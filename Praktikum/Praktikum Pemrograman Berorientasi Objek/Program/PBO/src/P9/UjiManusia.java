/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P9;

/**
 *
 * @author FERGA
 */
public class UjiManusia {
    public static void cetakData(Manusia mn){
        System.out.println(mn.getData());
    }
    public static void main(String[] args){
        Mhs m = new Mhs("Ferdi", "Pria");
        Dosen d = new Dosen("Aji", "PBO");
        cetakData(m);
        cetakData(d);
    }
}
