
package com.luna.generadorcontrasegnaascii;

/**
 *
 * @author deadm
 */
public class Password {
    
    private String contraseña;
    private byte tamanio;
    private byte mayus;
    private byte minus;
    private byte nums;
    public Password(byte tamanio, boolean mayus, boolean minus, boolean nums) {
        this.tamanio = tamanio;
        if (mayus) {
            this.mayus=1;
        }else{
            this.mayus=0;
        }
        if (minus) {
            this.minus=1;
        }else{
            this.minus=0;
        }
        if (nums) {
            this.nums=1;
        }else{
            this.nums=0;
        }
        this.contraseña = generandoContraseñas();
        
        
    }
    private String generandoContraseñas(){
        String password = "";
        int caracteres = this.mayus + this.minus + this.nums;
         for (int i = 0; i < tamanio; i++) {
            
            int eleccion=((int) Math.floor(Math.random()*caracteres+1));
            
            
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
    return "La contraseña generada es: \n"+contraseña;
    }  
   
    
}
