
import agenciasisii.Conexion;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunnar
 */
class Agencia {
     Conexion conexion ; 

     public Agencia (){
        conexion = new Conexion();
        conexion.conectar();
     }
     
     
    public Contrato nuevoContrato() {
       
        Contrato contrato=new Contrato(conexion);
        
        
        
        boolean id = contrato.llenar(1, 1, 1600, new GregorianCalendar(2016, 12, 12), new GregorianCalendar(2017, 12, 12), new GregorianCalendar(2016, 12, 10), "descripcion");

        
        
        
        
       // conexion.insertar("insert into contrato values (1 ,1, 1, 5600, '22/12/16', '22/12/17', '19/12/16', 'Desc')");
        
        
        return contrato;
    }
    
    
}
