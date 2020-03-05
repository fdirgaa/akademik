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
import java.text.DecimalFormat;
public class TestRoundShape {
    public static void main(String[] args){
        DecimalFormat digit = new DecimalFormat("0.##");
        Circle lingk1 = new Circle(20,5,10.0f);
        System.out.println(digit.format(lingk1.area()));
    }
}
