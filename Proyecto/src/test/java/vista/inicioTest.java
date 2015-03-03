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
     * Test of processRequest method, of class inicio.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        inicio instance = new inicio();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class inicio.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        inicio instance = new inicio();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class inicio.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        inicio instance = new inicio();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class inicio.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        inicio instance = new inicio();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
