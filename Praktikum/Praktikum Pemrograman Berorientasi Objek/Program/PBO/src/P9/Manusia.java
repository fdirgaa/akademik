/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P9;

/**
 *
 * @author FERGA
 */
abstract class Manusia {
    protected String nama;
    protected String jk;
    public String getData(){
        return nama + " adalah manusia";
    }
    public abstract String[] setBio();
}
