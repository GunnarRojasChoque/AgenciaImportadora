/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gunnar
 */
public class ContratoTest {

    public ContratoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void prueba() {
        
    }


    @Test
    public void Empleado(){
    
        Empleado em = new Empleado();

        boolean estado = em.getEstado();
        
        boolean estadoActual = em.getEstadoActual();
        
        assertTrue(estado);
        assertTrue(estadoActual);
    }   
    
}
