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
       //ejercicio 7 codigo ASCII a caracter
        String texto;     // Variable para almacenar el texto ingresado por el usuario
        int codigo;       // Variable para almacenar el valor numérico ingresado por el usuario
        char caracter;    // Variable para almacenar el carácter resultante
        Scanner entrada = new Scanner(System.in);

        // Solicita al usuario que ingrese un número y almacena el valor en la variable 'texto'
        //texto = JOptionPane.showInputDialog("Ingrese el codigo ASCII para saber el caracter");
        // Convierte el valor en 'texto' en un número entero (int)
        //codigo = Integer.parseInt(texto);

        // Convierte el número 'codigo' en un carácter (char) utilizando un cast
       // caracter = (char) codigo;
        System.out.println("Ingrese tamaño de contraseña:");
        byte tamagno = entrada.nextByte();
        String password = "";
        
        for (int i = 0; i < tamagno; i++) {
          int numeroAleatorio = new Random().nextInt(75) + 48;
           caracter = (char) numeroAleatorio;
            
            password+=caracter;
        }
        System.out.println("Tu contraseña es: " +password);
        // Imprime el carácter resultante en la consola
        //System.out.println(caracter);
    }
    
}
