/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.luna.generadorcontrasegnaascii;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luna
 */
public class GeneradorContrasegnaASCII {

    public static void main(String[] args) {
        /*
        Generacion de passsword usando ASCII
        Con ventanas JOptionPane V2
        */
        char caracter;   

        byte tamanio = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el tamaño de su contraseña"));

        String password = "";

        for (int i = 0; i < tamanio; i++) {
            
            int eleccion=((int) Math.floor(Math.random()*3+1));
            
            
            switch (eleccion){
                case 1: 
                    char minusculas = ((char)((int) Math.floor(Math.random()*(123-97)+97)));
                        password += minusculas;
                    break;
                       
                case 2:
                    char mayusculas = ((char)((int) Math.floor(Math.random()*(91-65)+65)));
                        password += mayusculas;
                    break;
                    
                case 3: 
                    char numeros = ((char)((int) Math.floor(Math.random()*(58-48)+48)));
                        password += numeros;
                    break;
            
            }
            
        }
        JOptionPane.showMessageDialog(null, "su contraseña es: " + password);

    }

}
