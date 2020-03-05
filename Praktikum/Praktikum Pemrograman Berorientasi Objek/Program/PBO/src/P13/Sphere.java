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
public class Sphere extends RoundShape{
    public Sphere(int xCenter, int yCenter, float radius){
        super(xCenter, yCenter, radius);
    }
    
    public float area(){
        float surfaceArea = (float)(4.0*Math.PI*Math.pow(radiusOfCircle, 2.0));
        return surfaceArea;
    }
}
