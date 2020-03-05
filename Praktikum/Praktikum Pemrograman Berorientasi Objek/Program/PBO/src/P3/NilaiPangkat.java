/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author FERGA
 */
public class NilaiPangkat {
    private double bilangan, pangkat, hasil;
    
    public void setPangkat(double bilangan, double pangkat){
        this.bilangan = bilangan;
        this.pangkat = pangkat;
        this.hasil = Math.pow(bilangan, pangkat);
    }
    
    public void hitung(){
        System.out.println("Angka : "+bilangan);
        System.out.println("Pangkat : "+pangkat);
        System.out.println("Hasil Pangkat : "+hasil);
    }
    
    public static void main(String[] args){
        NilaiPangkat np = new NilaiPangkat();
        np.setPangkat(2, 3);
        np.hitung();
    }
}


