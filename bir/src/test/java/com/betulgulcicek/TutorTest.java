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
public class TutorTest {
    
    public TutorTest() {
    }
    
   @BeforeClass
    public static void setUpClass() {
        System.out.println(" TutorTest.BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" TutorTest.AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println(" TutorTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println(" TutorTest.After");
    }


    @Test
    public void testSomeMethod() {
        System.out.println("Users classini extend eden bir class\n");
    }
    
}
