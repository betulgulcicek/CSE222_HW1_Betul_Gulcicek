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

/**
 *
 * @author GULCİCEK
 */
public class CASApplicationTest {

    public CASApplicationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("CASApplicationTest.BeforeClass\n Program wait to run");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("CASApplicationTest.BeforeClass Program result");
    }

    @Before
    public void setUp() {
        System.out.println("CASApplicationTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println("CASApplicationTest.After");
    }

    /**
     * Test of main method, of class CASApplication.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        CASApplicationTest myObject = new CASApplicationTest();
        myObject.doSomething();
    }

    public void doSomething() {
        System.out.println("Main TEST");
    }

}
