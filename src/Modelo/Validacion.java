/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class Validacion {
    
    public String nombre(String nom) {
        String res="";
        String exprecion = ("[a-zA-Z]{1,20}\\s?[a-zA-Z]{1,20}");
        Pattern p = Pattern.compile(exprecion);
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            res = nom;
            System.out.println("nombre valido:"+nom );
        } else {
            JOptionPane.showMessageDialog(null,"\n",
                "Llene Correctamente el Campo Nombre ", JOptionPane.INFORMATION_MESSAGE);
            //System.out.println("error en nombre");
            
        }
        return res;
    }
    
    public String apellido(String app){
        String res="";
        String exprecion = "[a-zA-Z]{3,20}\\s?[a-zA-Z]{1,20}";
        Pattern p = Pattern.compile(exprecion);
        Matcher m = p.matcher(app);
        if (m.matches()){
            res=app;
             System.out.println(" Pellido:"+app);
        } else {
           JOptionPane.showMessageDialog(null,"\n",
                "Llene Correctamente el Campo Apellido ", JOptionPane.INFORMATION_MESSAGE);;
        }
       return res;
    }
    
}
