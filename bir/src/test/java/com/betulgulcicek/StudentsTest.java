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
public class StudentsTest {
    
    public StudentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(" StudentsTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(" StudentsTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println(" StudentsTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println(" StudentsTest.After");
    }

    @Test
    public void testSomeMethod() {
        System.out.println("Student ve Teacher classlarinin sub classi\n");
    }
    
}
