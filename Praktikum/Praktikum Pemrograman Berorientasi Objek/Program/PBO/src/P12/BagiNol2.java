/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P12;

/**
 *
 * @author FERGA
 */
public class BagiNol2 {
    public static void main(String[] args){
        System.out.println("Sebelum pembagian");
        try{ System.out.println(5/0);}
        catch(Exception t){
            System.out.println("Pesan kesalahan: ");
            System.out.println(t.getMessage());
        }
        System.out.println("Sesudah pembagian");
    }
}
