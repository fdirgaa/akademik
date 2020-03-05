/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P12;

/**
 *
 * @author FERGA
 */
public class DemoEksepsi {
    public static void methodLain(){
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan eksepsi dalam Method MethodLain()");
            throw e;
        }
    }
    public static void main(String[] args){
        try{
            methodLain();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan eksepsi dalam Method main()");
        }
    }
}
