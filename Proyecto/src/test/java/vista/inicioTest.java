/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import vista.Inicio;
import static org.junit.Assert.*;

/**
 *
 * @author bray
 */
public class inicioTest {
    
    public inicioTest() {
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
     * Test of processRequest method, of class Inicio.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        Inicio instance = new Inicio();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class Inicio.
     */
    @Test
    public void testDoGet() throws Exception {
//        System.out.println("doGet");
//        HttpServletRequest request = null;
//        HttpServletResponse response = null;
//        Inicio instance = new Inicio();
//        instance.doGet(request, response);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class Inicio.
     */
    @Test
    public void testDoPost() throws Exception {
//        System.out.println("doPost");
//        HttpServletRequest request = null;
//        HttpServletResponse response = null;
//        Inicio instance = new Inicio();
//        instance.doPost(request, response);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class Inicio.
     */
    @Test
    public void testGetServletInfo() {
//        System.out.println("getServletInfo");
//        Inicio instance = new Inicio();
//        String expResult = "";
//        String result = instance.getServletInfo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of ImprimirPagina method, of class Inicio.
     */
    @Test
    public void testImprimirPagina() throws Exception {
        System.out.println("ImprimirPagina");
        HttpServletResponse response = null;
        int TipoUsuario = 0;
        Inicio instance = new Inicio();
        boolean expResult = true;
        boolean result = instance.ImprimirPagina(response, TipoUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("ImprimirPagina 2");
        response = null;
        TipoUsuario = 1;
         instance = new Inicio();
         expResult = true;
        result = instance.ImprimirPagina(response, TipoUsuario);
        assertEquals(expResult, result);
    }
    
}
