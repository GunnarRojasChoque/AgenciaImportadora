/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import agenciasisii.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Max
 */
public class Venta {
    
    Conexion conexion ;

    int getVentaAutos(String nombre) {
        conexion = new Conexion();
        conexion.conectar();
        ResultSet rs = null;
        //String nombre = "Gunnar";
        int res = 0;
        try {
            rs = conexion.resultado("SELECT public.\"nventasemp\"('" + nombre + "');");
            rs.next();
            res = rs.getInt(1);
            System.out.println("cantidad vendida por: "+nombre+ " = "+ res); 
        }
        catch(Exception e) {
         System.out.println("error");
        }
        return res;        
    }

    
    
    public int ventasPorModelo(String nom) {
        conexion = new Conexion();
        conexion.conectar();
        ResultSet rs = null;
        int res = 0;
        try {
           rs = conexion.resultado("SELECT get_ventaspormodelo('"+nom+"');");
           rs.next();
           res = rs.getInt(1);
           System.out.println(res);
           }
        catch(Exception e) {
           System.out.println("error consulta modelos");
        }
        return res;
        
    }
    
}
