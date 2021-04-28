/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_tema3_entorno;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jesus
 */
public class Empleado2Test {
     static Empleado paco;
    
    
    public Empleado2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
      paco=new Empleado(3,"paco",1000);
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

    /**
     * Test of calcularsalarioAnual method, of class Empleado2.
     */
    @Test
    public void testCalcularsalarioAnual() {
        System.out.println("calcularsalarioAnual");
        Empleado Empleado = null;
        double expResult = 12000;
        double result = Empleado2.calcularsalarioAnual(paco);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularBono method, of class Empleado2.
     */
    @Test
    public void testCalcularBono() {
        System.out.println("calcularBono");
 
        double expResult =1000;
        double result = Empleado2.calcularBono(paco);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
