/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P6;

/**
 *
 * @author KomDas
 */
public class Author {
    private String nmAuthor;
    private int thnTerbit;
    private Buku buku;
    
    public Author(){
        this.nmAuthor = "Rondha Byrne";
        this.thnTerbit = 2016;
        this.buku = new Buku();
        buku.setBuku("The Secrets", 149000, 198);
    }
    
    public void cetakAuthor(){
        System.out.println("Nama Author : "+this.nmAuthor);
        System.out.println("Tahun Terbit : "+this.thnTerbit);
        buku.tampil();
    } 
}
