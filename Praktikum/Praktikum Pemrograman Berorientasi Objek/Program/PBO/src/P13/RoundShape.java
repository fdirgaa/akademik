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
public abstract class RoundShape {
    //Coordinates of center represented by an inner class
    protected class Center{
        int x, y;
    }
    protected Center C = new Center();
    protected float radiusOfCircle;
    
    //Constructor
    public RoundShape(int xCenter, int yCenter, float radius){
        C.x = xCenter;
        C.y = yCenter;
        radiusOfCircle = radius;
    }
    
    //Abstract Method
    abstract public float area();
}
