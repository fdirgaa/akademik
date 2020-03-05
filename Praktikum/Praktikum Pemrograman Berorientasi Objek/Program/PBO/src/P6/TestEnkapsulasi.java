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
public class TestEnkapsulasi {
    public static void main(String[] args){
        Pegawai dataPeg = new Pegawai();
        dataPeg.setNama("Budi");
        dataPeg.setJabatan("Supervisor");
        dataPeg.setGaji(4000000);
        dataPeg.cetakPegawai();
    }
}
