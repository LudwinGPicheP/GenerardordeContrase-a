package com.luna.generadorcontrasegnaascii;

import javax.swing.JOptionPane;

/**
 *
 * @author deadm
 */
public class Password {

    private String contraseña;
    private byte tamanio;
    private boolean mayus;
    private boolean minus;
    private boolean nums;

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

    private String generandoContraseñas() {
        String password = "";
        int eleccion = 0;
        if (minus == false && mayus == false && nums == false) {
            JOptionPane.showMessageDialog(null, "ERROR NO SE PUEDE GENERAR CONTRASEÑA \n SI NO SELECCIONA POR LO MENOS UNA OPCION");
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

    @Override
    public String toString() {
        return "La contraseña generada es: \n" + contraseña;
    }

}
