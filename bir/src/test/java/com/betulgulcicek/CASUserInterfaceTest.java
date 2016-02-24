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
public class CASUserInterfaceTest {
    
    public CASUserInterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CASUserInterfaceTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("CASUserInterfaceTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("CASUserInterfaceTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("CASUserInterfaceTest.After");
    }

    /**
     * Test of processCommandsConsole method, of class CASUserInterface.
     */
    @Test
    public void testProcessCommandsConsole() {
        System.out.println("processCommandsConsole");
        CASConsoleUI instance = new CASConsoleUI();
        instance.processCommandsConsole();
    }

    /**
     * Test of processSenarios method, of class CASUserInterface.
     */
    @Test
    public void testProcessSenarios() {
        System.out.println("processSenarios");
        CASConsoleUI instance = new CASConsoleUI();
        instance.processSenarios();
    }

    
}
