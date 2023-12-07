
package com.luna.generadorcontrasegnaascii;

/**
 *
 * @author deadm
 */
public class Password {
    
    private String contraseña;
    private byte tamanio;

    public Password(byte tamanio) {
        this.tamanio = tamanio;
        this.contraseña = generandoContraseñas();
        
    }
    public String generandoContraseñas(){
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
          return password;
    }
    
    @Override 
    public String toString(){
    return "La contraseña generada es: "+contraseña;
    }  
   
    
}
