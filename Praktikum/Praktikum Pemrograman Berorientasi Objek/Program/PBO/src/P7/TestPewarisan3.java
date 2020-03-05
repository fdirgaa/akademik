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
public class TestPewarisan3 {
    public static void main(String[] args){
        //Membuat Objek Pegawai => superclass
        Pegawai dataPeg1 = new Pegawai();
        dataPeg1.cetakPegawai();
        dataPeg1.toString();
        Pegawai dataPeg2 = new Pegawai(3000000);
        dataPeg2.cetakPegawai();
        dataPeg2.toString();
        Pegawai dataPeg3 = new Pegawai("Budi", "Dosen");
        dataPeg3.cetakPegawai();
        dataPeg3.toString();
        
        //Membuat Objek Dosen => subclass
        Dosen dataDosen1 = new Dosen(4000000);
        dataDosen1.cetakPegawai();
        dataDosen1.toString();
        Dosen dataDosen2 = new Dosen("Budi", "Dosen","PBO");
        dataDosen2.cetakPegawai();
        dataDosen2.toString();
        
    }
}
