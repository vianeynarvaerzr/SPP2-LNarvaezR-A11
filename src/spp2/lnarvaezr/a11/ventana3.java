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
    public class ventana3 extends Frame {
    private final Button btn1, btn2, btn3, btn4,btn5,btn6,btn7,btn8,btn9;
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3(){
        setLayout(new GridLayout());
         btn1 = new Button("Soy el botón #1");
        add (btn1);
        btn2 = new Button("Soy el botón #2");
        add (btn2);
        btn3 = new Button("Soy el botón #3");
        add (btn3);
        btn4 = new Button("Soy el botón #4");
        add (btn4);
        btn5 = new Button("Soy el botón #5");
        add (btn5);
        btn6 = new Button("Soy el botón #6");
        add (btn6);
         btn7 = new Button("Soy el botón #7");
        add (btn7);
         btn8 = new Button("Soy el botón #8");
        add (btn8);
         btn9 = new Button("Soy el botón #9");
        add (btn9);
         setSize(500,500);
        setVisible(true);    
    }
    
}
