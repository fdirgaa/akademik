/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iput;

/**
 *
 * @author ferdi
 */
class Buku { 
    String Judulbuku;  int Kodebuku; 
    String Typebuku; 
    Buku(String judul, int kode, String type) // konstruktor 
    { 
        Judulbuku = judul; 
        Kodebuku = kode; 
        Typebuku = type; 
    } 
    Buku() //konstruktor 
    { 
        Judulbuku= "Kamu"; 
        Kodebuku = 2514; 
        Typebuku = "Romance"; 
    } 
    void Show() 
    { 
        System.out.println("Informasi Buku"); 
        System.out.println("Judul     : "+Judulbuku); 
        System.out.println("Kode  : "+Kodebuku); 
        System.out.println("Type  : "+Typebuku); 
    } 
    public static void main(String args[]) 
    { 
        Buku buku1 = new Buku(); 
        Buku judulbuku2 = new Buku("Kamu",3313,"Romance");
        buku1.Show();
        judulbuku2.Show(); 
    } 
}

