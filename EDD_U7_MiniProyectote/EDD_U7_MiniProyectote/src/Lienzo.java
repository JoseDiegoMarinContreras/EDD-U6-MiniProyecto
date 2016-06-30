
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherne
 */
public class Lienzo extends Canvas{
    Cronometro c;
    int arr[];
    long valores[];
   
    
    public Lienzo(int largo,int ancho){
        setSize(largo,ancho);
        c = new Cronometro();
        valores = new long[8];
        //valores[0]=600000;
        
    }
    
    public void paint(Graphics g){
        //marco del lienzo
        Graphics2D g2=(Graphics2D)g;
        g2.setStroke(new BasicStroke(4.0f));
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth(), getHeight());
        
        //Ejes de la grafica
        g.drawLine(40, getHeight()-20, 450, getHeight()-20);
        g.drawLine(40, getHeight()-20, 40, 20);
        
        //Barritas
        //if(arr!=null){
            //Burbuja
            long x = valores[0];
            x=(x*264)/600000;
            JOptionPane.showMessageDialog(this,""+x);
            g.drawRect(50,(int)(264-x)+20, 25, (int)x);
            //quicksort
            x = valores[1];
            x=(x*264)/600000;
            JOptionPane.showMessageDialog(this,""+x);
            g.drawRect(90,(int)(264-x)+20, 25, (int)x);
        //}
    }
    
}
