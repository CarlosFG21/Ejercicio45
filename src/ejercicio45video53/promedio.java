
package ejercicio45video53;

import java.util.*;
import javax.swing.JOptionPane;

public class promedio {
    
    public void promedio1(){
        
        int numero,elementos=0,suma=0;
        
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
        
        while(numero>=0){
            
            suma = suma + numero;
            elementos++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OTRO NUMERO"));
            
        }
       
        if(elementos == 0){
            System.out.println("ERROR: LA DIVISION ENTRE 0 NO EXISTE");
            
        }else{
            media=(float)suma/elementos;
            
            JOptionPane.showMessageDialog(null,"LA MEDIA ES: " + media);
            //System.out.println("LA MEDIA ES: " +media);
        }
    }
}
