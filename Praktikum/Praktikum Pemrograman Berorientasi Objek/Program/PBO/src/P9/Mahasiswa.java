/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P9;

/**
 *
 * @author KomDas
 */
abstract class Mahasiswa {
    protected String nama;
    protected int nilai;
    public abstract String isiBiodata(String nama, int nilai); 
    public String registrasi(){
        return "nama " + nama + " telah melakukan registrasi";
    }
    public String testMasuk(){
        return "nilai test anda " + nilai;
    }
}
