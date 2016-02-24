/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betulgulcicek;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GULCİCEK
 */
public class UsersTest {
    
    public UsersTest() {
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
     * Test of getUserID method, of class Users.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class Users.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String userID = "";
        Users instance = new Users();
        instance.setUserID(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class Users.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class Users.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        Users instance = new Users();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Users.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Users.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Users instance = new Users();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enrolOperations method, of class Users.
     */
    @Test
    public void testEnrolOperations() {
        System.out.println("enrolOperations");
        Users instance = new Users();
        instance.enrolOperations();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
