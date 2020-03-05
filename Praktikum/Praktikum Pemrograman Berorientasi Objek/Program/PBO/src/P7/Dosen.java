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
public class Dosen extends Pegawai {
    private String mtkDiampu;
    public Dosen(int gaji){
        super();
        this.setGaji(gaji);
    }
    public Dosen(String nama, String jabatan, String mtkDiampu){
        this(nama, jabatan);
        this.setMtkDiampu(mtkDiampu);
    }
    public Dosen(String nama, String jabatan){}
    
    public String getMtkDiampu(){
        return this.mtkDiampu;
    }
    public void setMtkDiampu(String mtkDiampu){
        this.mtkDiampu=mtkDiampu;
    }
}
