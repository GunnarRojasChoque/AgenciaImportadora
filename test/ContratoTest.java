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
        Agencia agen = new Agencia();
        Contrato contrato = agen.nuevoContrato();
        boolean id = contrato.llenar(1, 1, 1600, new GregorianCalendar(2016, 12, 12), new GregorianCalendar(2017, 12, 12), new GregorianCalendar(2016, 12, 10), "descripcion");

        assertTrue(id);
    }
    
    

}
