/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Max
 */
public class VentaTest {
    
    public VentaTest() {
    }

    @Test
    public void testSomeMethod() {
        Venta v = new Venta();
        String nomb = "Gunnar";
        int esperado = 3;
       int res = v.getVentaAutos(nomb);
      // System.out.println("cantidad vendida por: "+"gunnar"+ " = "+ res);
       assertEquals(esperado, res);
    }
     @Test
    public void testSomeMethod2() {
       Venta v = new Venta();
       String nomb = "Gunnar";
       int esperado = 2;
       int res = v.getVentaAutos(nomb);
       assertEquals(esperado, res);
    }
     public void testSomeMethod3() {
       Venta v = new Venta();
       String nomb = "Gunnar";
       int esperado = 30;
       int res = v.getVentaAutos(nomb);
       if(res < 5){
         v.mostrarMensaje();//mostrara mensaje con las 5 ventas realizadas
       }else{
         v.mostrarDetalleTotal();//desplegara otra Interfaz con el total vendido
       }
       assertEquals(esperado, res);
    }

     
    
}
