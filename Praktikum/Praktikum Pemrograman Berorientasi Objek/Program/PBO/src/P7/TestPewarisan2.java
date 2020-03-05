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
public class TestPewarisan2 {
    public static void main(String[] args){
        //Membuat Objek Pegawai => superclass
        Pegawai dataPeg = new Pegawai("Budi", "Dosen");
        dataPeg.cetakPegawai();
        dataPeg.toString();
        //Membuat Objek Dosen => subclass
        Dosen dataDosen = new Dosen("Budi", "Dosen", "PBO");
        dataDosen.cetakPegawai();
        dataDosen.toString();
    }
}
