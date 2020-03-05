/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P5;

/**
 *
 * @author KomDas
 */
public class TesFilm {
    public static void main(String[] args){
        Film film1 = new Film();
        film1.setFilm("Warkop DKI", "Komedi", 120);
        System.out.println("Judul Film : " + film1.judul);
        System.out.println("Jenis Film : " + film1.jenis);
        System.out.println("Durasi Film : " + film1.durasi);
    }
}
