/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13;

/**
 *
 * @author FERGA
 */
public class Luar {
    private int angkaLuar;
    public Luar(int angkaLuar){
        this.angkaLuar = angkaLuar;
    }
    
    int getAngkaLuar(){
        return angkaLuar;
    }
    
    //Inner Class
    class Dalam{
        private int angkaDalam;
        
        public Dalam(){
            angkaDalam = 9;
        }
        
        public void cetakDalam(){
            System.out.println("Ini angka luar: "+angkaLuar);
            System.out.println("Ini angka dalam: "+angkaDalam);
        }
    }
    public void cetakLuar(){
        Dalam dl = new Dalam();
        dl.cetakDalam();
    }
    public static void main(String[] args){
        Luar lu = new Luar(5);
        lu.cetakLuar();
    }
}
