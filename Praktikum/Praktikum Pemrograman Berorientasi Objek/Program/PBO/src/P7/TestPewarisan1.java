/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P7;

/**
 *
 * @author KomDas
 */
public class TestPewarisan1 {
    public static void main(String[] args){
        //Membuat objek Pegawai => superclass
        Pegawai dataPeg = new Pegawai("Budi", "Dosen");
        dataPeg.cetakPegawai();
        //Membuat Objek Dosen => Subclass
        Dosen dataDosen = new Dosen("Budi", "Dosen", "PBO");
        dataDosen.cetakPegawai();
    }
}
