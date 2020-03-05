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
class Handphone {
    String merk;
    int backCamera;
    public void setHP(String merk, int backCamera){
        this.merk=merk;
        this.backCamera=backCamera;
    }
    
    public void tampil(){
        System.out.println("Merk : " + merk);
        System.out.println("Back Camera : " + backCamera);
    }
}
