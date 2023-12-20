
package com.mycompany.dispositivoses;

import java.util.Random;

/**
 *
 * @author 
 * 
 */
public class Estado {
    
    Random numAleatorio = new Random();
    private boolean Aleatorio = numAleatorio.nextBoolean();
    
public Estado(){
    
    if (Aleatorio){
        System.out.println("**///--------------------------------------///**");
        System.out.println("Dispositivo Cargado Correctamente:");
    
        }else{
                System.out.println("**///--------------------------------------///**");
                System.out.println("¡ERROR! Conexion Interrumpida:");
                
                }
        
    
    }

public Estado(boolean aleatorio){

    Aleatorio = aleatorio;
}

public boolean GetAleatorio(){
    
    return this.Aleatorio;
    
    }

public void Aleatorio(boolean Aleatorio){
    
    this.Aleatorio = Aleatorio;
    
    
    
    }

    


}
    

