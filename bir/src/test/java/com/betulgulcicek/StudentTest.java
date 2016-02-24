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
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(" StudentTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(" StudentTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println(" StudentTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println(" StudentTest.After");
    }

    @Test
    public void testSomeMethod() {
        System.out.println("Students classini implement eden bir class\n");
    }
    
}
