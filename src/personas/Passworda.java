/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author BETSABE
 */
public class Passworda {
    
    int longitud;
    String contra;
    Random rdm;
    
    public Passworda(String contra){
        this.longitud=8;
        this.generarPasword();
    }
    public Passworda(int longitud){
        this.longitud=longitud;    
    }
    public boolean esFuerte(String contra){
//        if(longitud=longitud){
//        return true;
//        }else{
//        
//        }
        return true;
        //JOptionPane.showMessageDialog(null, nombre);
    }
    private String generarPasword(){
//        String aleatorio=String valueof(rdm.nextInt(longitud));
        return ""; //aleatorio;
    }
}

