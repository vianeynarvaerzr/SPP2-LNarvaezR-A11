/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a11;
import java.awt.*;
/**
 *
 * @author Vianey_Narváez
 */
public class ventana2 extends Frame {
    private final Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
   @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2(){
        setLayout(new BorderLayout());
        btnNorte = new Button("Soy el botón Norte");
        add (btnNorte,BorderLayout.NORTH);        
        btnSur = new Button ("Soy el botón Sur");
        add (btnSur, BorderLayout.SOUTH);
        btnEste = new Button ("Soy el botón Este");
        add (btnEste, BorderLayout.EAST);
        btnOeste = new Button ("Soy el botón Oeste");
        add(btnOeste, BorderLayout.WEST);
        btnCentro = new Button ("Soy el botón Centro");
        add(btnCentro, BorderLayout.CENTER);
        setSize(800,600);
        setVisible(true);
    }   
}
