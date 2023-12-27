package com.luna.generadorcontrasegnaascii;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;

/**
 * Clase que representa un generador de contraseñas ASCII.
 * @author Luna
 */
public class Password {

    private String contraseña;
    private byte tamanio;
    private boolean mayus;
    private boolean minus;
    private boolean nums;

    /**
     * Constructor de la clase Password.
     *
     * @param tamanio Tamaño de la contraseña a generar.
     * @param mayus   Indica si se deben incluir letras mayúsculas en la contraseña.
     * @param minus   Indica si se deben incluir letras minúsculas en la contraseña.
     * @param nums    Indica si se deben incluir números en la contraseña.
     */
    public Password(byte tamanio, boolean mayus, boolean minus, boolean nums) {
        this.tamanio = tamanio;
        if (mayus) {
            this.mayus = true;
        } else {
            this.mayus = false;
        }
        if (minus) {
            this.minus = true;
        } else {
            this.minus = false;
        }
        if (nums) {
            this.nums = true;
        } else {
            this.nums = false;
        }
        this.contraseña = generandoContraseñas();

    }
    /**
     * Genera una contraseña aleatoria según los criterios especificados.
     *
     * @return Contraseña generada.
     */
    private String generandoContraseñas() {
        String password = "";
        int eleccion = 0;
        if (minus == false && mayus == false && nums == false) {
            JOptionPane.showMessageDialog(null, "ERROR NO SE PUEDE GENERAR CONTRASEÑA \nSI NO SELECCIONA POR LO MENOS UNA OPCION");
        } else {
            for (int i = 0; i < tamanio; i++) {
                if (minus && mayus && nums) {
                    eleccion = ((int) Math.floor(Math.random() * 3 + 1));

                    switch (eleccion) {
                        case 1:
                            char minusculas = ((char) ((int) Math.floor(Math.random() * (123 - 97) + 97)));
                            password += minusculas;
                            break;

                        case 2:
                            char mayusculas = ((char) ((int) Math.floor(Math.random() * (91 - 65) + 65)));
                            password += mayusculas;
                            break;

                        case 3:
                            char numeros = ((char) ((int) Math.floor(Math.random() * (58 - 48) + 48)));
                            password += numeros;
                            break;
                    }
                } else if (minus && mayus) {
                    eleccion = ((int) Math.floor(Math.random() * 2 + 1));
                    switch (eleccion) {
                        case 1:
                            char minusculas = ((char) ((int) Math.floor(Math.random() * (123 - 97) + 97)));
                            password += minusculas;
                            break;

                        case 2:
                            char mayusculas = ((char) ((int) Math.floor(Math.random() * (91 - 65) + 65)));
                            password += mayusculas;
                            break;
                    }
                } else if (minus && nums) {
                    eleccion = ((int) Math.floor(Math.random() * 2 + 1));
                    switch (eleccion) {
                        case 1:
                            char minusculas = ((char) ((int) Math.floor(Math.random() * (123 - 97) + 97)));
                            password += minusculas;
                            break;

                        case 2:
                            char numeros = ((char) ((int) Math.floor(Math.random() * (58 - 48) + 48)));
                            password += numeros;
                            break;
                    }
                } else if (mayus && nums) {
                    eleccion = ((int) Math.floor(Math.random() * 2 + 1));
                    switch (eleccion) {
                        case 1:
                            char mayusculas = ((char) ((int) Math.floor(Math.random() * (91 - 65) + 65)));
                            password += mayusculas;
                            break;

                        case 2:
                            char numeros = ((char) ((int) Math.floor(Math.random() * (58 - 48) + 48)));
                            password += numeros;
                            break;
                    }
                } else if (minus) {
                    char minusculas = ((char) ((int) Math.floor(Math.random() * (123 - 97) + 97)));
                    password += minusculas;
                } else if (mayus) {
                    char mayusculas = ((char) ((int) Math.floor(Math.random() * (91 - 65) + 65)));
                    password += mayusculas;
                } else if (nums) {
                    char numeros = ((char) ((int) Math.floor(Math.random() * (58 - 48) + 48)));
                    password += numeros;
                }
            }
        }
        return password;
    }

    /**
     * Obtiene la contraseña generada.
     *
     * @return Contraseña generada.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Copia la contraseña al portapapeles del sistema.
     */
    public void copiarContraseñaAlPortapapeles() {
        String contrasenia_copiada = getContraseña();
        if (!contrasenia_copiada.isEmpty()) {
            StringSelection stringSelection = new StringSelection(contrasenia_copiada);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            JOptionPane.showMessageDialog(null, "Contraseña copiada al portapapeles");

        }
    }

    /**
     * Sobrescribe el método toString para obtener una representación en cadena de la instancia.
     *
     * @return Representación en cadena de la contraseña generada.
     */
    @Override
    public String toString() {
        return "La contraseña generada es: \n" + contraseña;
    }

}
