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
public class Dosen extends Manusia {
    public Dosen(String nama, String jk){
        this.nama = nama;
        this.jk = jk;
    }
    public String getData(){
        return nama + " adalah seorang dosen matkul " + jk;
    }
    public String[] setBio(){
        String[] ar = {nama, jk};
        return ar;
    }
}
