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

        byte tamanio = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el tamaño de su contraseña"));

        Password contraseña = new Password(tamanio);
        
       
        JOptionPane.showMessageDialog(null, contraseña.toString());

    }

}
