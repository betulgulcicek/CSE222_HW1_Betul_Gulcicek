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
        System.out.println(" UsersTest.BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" UsersTest.AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println(" UsersTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println(" UsersTest.After");
    }


    /**
     * Test of getUserID method, of class Users.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String id = "345", name = "Ali", mail = "ali@gmail.com";
        Users instance = new Student(id, name, mail);
        String expResult = "345";
        String result = instance.getUserID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserID method, of class Users.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String userID = "658768";
        Users instance = new Student(userID, "Betul", "betul@gmail.com");
        instance.setUserID(userID);
    }

    /**
     * Test of getUserName method, of class Users.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String id = "345", name = "Veli", mail = "veli@gmail.com";
        Users instance = new Tutor(id, name, mail);
        String expResult = "Veli";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserName method, of class Users.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "Erkan";
        Users instance = new Teacher("34543", userName, "erkan@gmail.com");
        instance.setUserName(userName);
    }

    /**
     * Test of getEmail method, of class Users.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String id = "345", name = "Ali", mail = "ali@gmail.com";
        Users instance = new Student(id, name, mail);
        String expResult = "ali@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Users.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "tarik@gmail.com";
        Users instance = new Teacher("34543", "tarik", email);
        instance.setEmail(email);
    }

    /**
     * Test of enrolOperations method, of class Users.
     */
    @Test
    public void testEnrolOperations() {
        System.out.println("enrolOperations");
        Users instance = new Tutor();
        instance.enrolOperations();
    }
    
}
