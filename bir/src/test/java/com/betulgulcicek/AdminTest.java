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
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("AdminTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AdminTest.AfterClass");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTeacher method, of class Admin.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Teacher user = new Teacher("4656","tarik","tarik@gmail.com");
        //Admin instance = new Admin("1", "admin", "admin@gmail.com");
        Course instance = new Course("12323", "ayrik mat", true);
        instance.addTeacher(user,true);
    }

    /**
     * Test of removeTeacher method, of class Admin.
     */
    @Test
    public void testRemoveTeacher() {
        System.out.println("removeTeacher");
        String id = "4656";
        Course instance = new Course("12323", "ayrik mat", true);
        instance.removeTeacher(id);
    }

    /**
     * Test of getCourse method, of class Admin.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Admin instance = new Admin("1", "admin", "admin@gmail.com");
        Course expResult = new Course("12323", "ayrik mat", true);
        instance.setCourse(expResult);
        Course result = instance.getCourse();
        assertEquals(expResult, result);
    }

  
      /*  Team takim = new Team("GS", "sari", "kirmizi");
        TeknikDirektor expResult = new TeknikDirektor(takim, "Furkan", "11111111111",  "01/02/1984", "canakkale");
        FederasyonBskAndYrd instance = new FederasyonBskAndYrd();
        instance.setDirektor(expResult);
        TeknikDirektor result = instance.getDirektor();
        assertEquals(expResult, result);
    */
    
    
    
    
    
    
    /**
     * Test of setCourse method, of class Admin.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = new Course("12323", "ayrik mat", true);
        Admin instance = new Admin("1", "admin", "admin@gmail.com");
        instance.setCourse(course);
    }
    
}
