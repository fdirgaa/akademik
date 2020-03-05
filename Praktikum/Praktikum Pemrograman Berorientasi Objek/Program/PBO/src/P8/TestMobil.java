/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P8;

/**
 *
 * @author KomDas
 */
public class TestMobil {
    public static void main(String args[]){
        System.out.println("Merupakan pemanggilan object Mobil");
        Mobil avanza = new Mobil(10, "Avanza");
        avanza.PrintInfoMobil();
        System.out.println();
        System.out.println("Merupakan pemanggilan object Mobil");
        Truck truk = new Truck(7, "Tronton", "Kapasitas 10 ton");
        truk.PrintInfoMobil();
        truk.PrintInfoTruck();
    }
}
