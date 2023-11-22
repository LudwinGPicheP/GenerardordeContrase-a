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
            int numeroAleatorio = new Random().nextInt(75) + 48;
            caracter = (char) numeroAleatorio;

            password += caracter;
        }
      
        JOptionPane.showMessageDialog(null, "su contraseña es: " + password);

    }

}
