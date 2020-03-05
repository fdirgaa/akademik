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
public class TestMotor {
    public static void main(String[] args){
        SepedaMotor motor1 = new SepedaMotor();
        motor1.setNama("Honda");
        motor1.setWarna("Putih");
        motor1.setNoPlat("AB007CD");
        motor1.setKecepatan(100);
        motor1.setBBM("Pertamax");
        motor1.cetakSepedaMotor();
    }
}
