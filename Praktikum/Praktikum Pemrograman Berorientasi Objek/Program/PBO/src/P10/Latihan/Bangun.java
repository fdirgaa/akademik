/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P10.Latihan;

/**
 *
 * @author FERGA
 */
interface Bangun2D {
    public double hitungLuas();
    public double hitungKeliling();
}
interface Bangun3D{
    public double hitungVolume();
    public void tampilInfo();
}
interface Pola{
    public void setWarna(String warna);
    public String getWarna();
}
class Lingkaran implements Bangun2D{
    public double jarijari;
    public void setJariJari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJariJari(){
        return this.jarijari;
    }
    public double hitungLuas(){
        return (3.14 * this.jarijari * this.jarijari);
    }
    public double hitungKeliling(){
        return (2 * 3.1 * this.jarijari);
    }
}
class Tabung extends Lingkaran implements Bangun3D, Pola{
    public double tinggi;
    public double alas;
    private String warna;
    Tabung(double tinggi, double alas, String warna){
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }
    public double hitungVolume() {
        return 3.14 * alas * alas * tinggi;
    }

    public void tampilInfo() {
        System.out.println("Tabung Berwarna: " + this.getWarna() + ", Volume = " + this.hitungVolume());
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
    }    
}
public class Bangun {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        Tabung t = new Tabung(28, 10, "Silver");
        l.setJariJari(10);
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
        System.out.println("Keliling Lingkaran: " + l.hitungKeliling());
        t.tampilInfo();
    }
}
