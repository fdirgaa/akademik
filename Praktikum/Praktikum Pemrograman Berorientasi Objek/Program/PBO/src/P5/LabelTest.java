/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P5;

/**
 *
 * @author KomDas
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabelTest extends JFrame {
    private JLabel label;
    public LabelTest(){
        super( "Mencoba JLabel" );
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );
        label = new JLabel( "Label dengan text" );
        label.setToolTipText( "Ini adalah label1" );
        container.add( label );
        setSize( 500, 400 );
        setVisible( true );
    }
    public static void main( String args[] ){
        LabelTest aplikasi = new LabelTest();
        aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}