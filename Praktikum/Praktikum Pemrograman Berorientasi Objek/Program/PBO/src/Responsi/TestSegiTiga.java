/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Responsi;

/**
 *
 * @author KomDas
 */
public class TestSegiTiga {
    public static void main(String[] args){
        SegiTiga st = new SegiTiga(12, 10);
        PrismaSegiTiga pst = new PrismaSegiTiga(10, 15, 30);
        
        st.tampilHasil();
        System.out.println();
        pst.tampilVolume();
    }
}
