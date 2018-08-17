/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video81;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marco_Layout marco = new Marco_Layout(); 
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        marco.setVisible(true); 
    }
    
}

class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("Prueba Acciones"); 
        setBounds(600,350,600,300); 
        Panel_Layout lamina = new Panel_Layout(); 
        add(lamina); 
        
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout(){
        
        add(new JButton("Amarillo")); 
        add(new JButton("Rojo")); 
        add(new JButton("Azul")); 
    }
}