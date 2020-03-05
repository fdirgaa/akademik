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
public class MultiCatchException {
    public static void main(String[] args){
        try{
            System.out.println(5/0);
        }
        catch(ArithmeticException e){
            System.out.println(0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(1);
        }
        catch(Exception e){
            System.out.println(2);
        }
        finally{
            System.out.println(3);
        }
    }
}
