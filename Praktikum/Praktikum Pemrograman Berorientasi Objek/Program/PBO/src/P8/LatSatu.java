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
public class LatSatu extends Mobil{
    protected String petrol;
    
    LatSatu(int kecmaks, String namaken, String petrol){
        super(kecmaks, namaken);
        this.petrol = petrol;
    }
    
    @Override
    public void PrintInfoMobil(){
        super.PrintInfoMobil();
        System.out.println("Bahan Bakar Kendaraan : " + petrol);
    }
    
    public static void main(String args[]){
        LatSatu mobil1 = new LatSatu(100, "Toyota", "Pertamax");
        mobil1.PrintInfoMobil();
    }
}
