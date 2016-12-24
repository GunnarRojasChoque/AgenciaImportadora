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
public class TipoTransaccionTest {
    
    public TipoTransaccionTest() {
    }

    @Test
    public void testSomeMethod() {
           int transaccionCredito=1;
           int transaccionEfectivo=2;
        if(transaccionCredito == 1){
           TipoTransaccion tipo =new TipoTransaccion(1);
        }else{
            TipoTransaccion tipo =new TipoTransaccion(2);
            }
    }
    
}
