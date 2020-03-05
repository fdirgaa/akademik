/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P1;

/**
 *
 * @author KomDas
 */
public class ObyekPegawai {
    public static void main(String[] args){
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setPegawai("Ferdi Dirgantara", "CEO", 21);
        pegawai1.tampil();
        
        Pegawai pegawai2 = new Pegawai();
        pegawai2.setPegawai("Aji K.", "CTO", 21);
        pegawai2.tampil();
    }
}
