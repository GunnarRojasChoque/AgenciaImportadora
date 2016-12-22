/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import agenciasisii.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Max
 */
public class TipoTransaccion {
    
    DefaultTableModel ModeloTabla;
    Conexion conexion ;
    //JTable tablacontactos;
    String [] columnas={"ID","Nombrecliente","modeloVehiculo","Descuento"};
    String [] registro=new String[4];
    int tipo; // tipo credito=1 , efectivo=2
    
    public TipoTransaccion(int tipo){
        this.tipo=tipo;
       ModeloTabla=new DefaultTableModel(null,columnas);
       conexion = new Conexion();
        conexion.conectar();
     
     }
    
    
     public void llenarTabla(JTable jTable1 ){
     String SSQL = "SELECT * FROM obtener_ventas_efectivo('"+tipo+"') as return(idcliente , nom,nombre,descuento)";
     ResultSet rs = null;
      try {
        rs = conexion.resultado(SSQL);
        while (rs.next()){
            registro[0]=rs.getString("idcliente");
            registro[1]=rs.getString("nom");
            registro[2]=rs.getString("nombre");
            registro[3]=rs.getString("descuento");
            //System.out.println(registro);
                     
            ModeloTabla.addRow(registro);//se aniade a la tabla por cada columna
        }
        //tablacontactos.setModel(ModeloTabla);
        jTable1.setModel(ModeloTabla);//se cambia el tabla con del midelo definido

     } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
      }
    }
}
