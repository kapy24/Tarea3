
package tarea_tema3_entorno;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesus
 */
public class BecaTest {
    
    public BecaTest() {
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

    /**
     * Test of calculoBeca method, of class Beca.
     */
    @Test
    public void testCalculoBeca() throws Exception {
        System.out.println("calculoBeca");
        double rentaFamiliar =0; //caso para beca maxima o 5001 error por tenta mayor a 5000
        int expResult = 1600;
        int result = Beca.calculoBeca(rentaFamiliar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
}
