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
class Awal{
    int x = 8;
    void methodAwal(){
        System.out.println("Nilai x = " + x);
    }
}
public class TestAnonymous {
    public static void main(String[] args){
        Awal noName = new Awal(){
            void methodAwal(){
                x+=3;
                System.out.println("X = " + x);
            }
        };
        noName.methodAwal();
    }
}
