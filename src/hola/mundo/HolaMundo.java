/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author 2dama
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        /**
         * Con esta opcion impedimos que el usuario modifique
         * el tamaño de la ventana
         */
        ventana.setResizable(false);
/**
 * Creacion de los objetos necesarios que vamos a usar en la ventana.
 */
        JLabel etiqueta = new JLabel("OESTE");
        JLabel etiqueta1 = new JLabel("ESTE");
        JButton boton = new JButton("NORTE");
        JButton boton1 = new JButton("SUR");
        JTextField texto = new JTextField("¡HOLA MUNDO!");
        
        /**
         * Distribucion de la interfaz.
         */
        ventana.getContentPane().add(boton, BorderLayout.NORTH);
        ventana.getContentPane().add(boton1, BorderLayout.SOUTH);
        ventana.getContentPane().add(etiqueta, BorderLayout.WEST);
        ventana.getContentPane().add(etiqueta1, BorderLayout.EAST);
        ventana.getContentPane().add(texto, BorderLayout.CENTER);
        ventana.pack();
        
        /**
         * Esta opcion cierra el proceso de la venta al darle a EXIT.
         */
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
