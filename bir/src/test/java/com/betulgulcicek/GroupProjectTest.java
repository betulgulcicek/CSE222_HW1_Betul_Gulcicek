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
public class GroupProjectTest {
    
    public GroupProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(" GroupProjectTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(" GroupProjectTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println(" GroupProjectTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println(" GroupProjectTest.After");
    }

    /**
     * Test of howManyStudent method, of class GroupProject.
     */
    @Test
    public void testHowManyStudent() {
        System.out.println("howManyStudent");
        GroupProject instance = new GroupProject("12/12/2016", "16/12/2016", 6);
        int expResult = instance.howManyStudent();;
        int result = instance.howManyStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getManyPeople method, of class GroupProject.
     */
    @Test
    public void testGetManyPeople() {
        System.out.println("getManyPeople");
        GroupProject instance = new GroupProject("12/12/2016", "16/12/2016", 3);
        instance.setManyPeople(3);
        int expResult = 3;
        int result = instance.howManyStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManyPeople method, of class GroupProject.
     */
    @Test
    public void testSetManyPeople() {
        System.out.println("setManyPeople");
        int manyPeople = 3;
        GroupProject instance = new GroupProject("12/02/2016", "16/02/2016", 3);
        instance.setManyPeople(manyPeople);
    }

    /**
     * Test of toString method, of class GroupProject.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String courseName = "Fizik";
        Course course = new Course("345", courseName, true);
        course.setCourseName(courseName);
        GroupProject instance = new GroupProject("12/02/2016", "16/02/2016", 9);
        //instance.setCourseName(course);
        String expResult = "Course Name: " + instance.getCourseName()
                + ", Deadline: " + instance.getDeadline() + ", Late Deadline: " 
                + instance.getLateDeadline()
                + ", Many People: " + instance.howManyStudent();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
