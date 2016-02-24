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
public class AssignmentsTest {
    
    public AssignmentsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("AssignmentsTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AssignmentsTest.AfterClass\n"
                + "Assignmentlar gerceklestiriliyor\n");
    }
    
    @Before
    public void setUp() {
        System.out.println("AssignmentsTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("AssignmentsTest.After");
    }

    /**
     * Test of getDeadline method, of class Assignments.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Assignments instance = new Quiz("17/02/2016","20/02/2016");
        String expResult = "17/02/2016";
        String result = instance.getDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeadline method, of class Assignments.
     */
    @Test
    public void testSetDeadline() {
        System.out.println("setDeadline");
        String deadline = "11/06/2016";
        Assignments instance = new Quiz(deadline,"12/06/2016");
        instance.setDeadline(deadline);
    }

    /**
     * Test of getLateDeadline method, of class Assignments.
     */
    @Test
    public void testGetLateDeadline() {
        System.out.println("getLateDeadline");
        Assignments instance =  new Homework("06/02/2016","17/02/2016");
        String expResult = "17/02/2016";
        String result = instance.getLateDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLateDeadline method, of class Assignments.
     */
    @Test
    public void testSetLateDeadline() {
        System.out.println("setLateDeadline");
        String lateDeadline = "09/10/2016";
        Assignments instance = new Quiz("12/12/2016",lateDeadline);
        instance.setLateDeadline(lateDeadline);
    }

    /**
     * Test of getCourseName method, of class Assignments.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        String courseName = "Fizik";
        Assignments instance = new Quiz("09/10/2016", "12/12/2016");
        
        Course expResult = new Course("768678", courseName, true);
        instance.setCourseName(expResult);
        Course result = instance.getCourseName();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Assignments.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "bilgi ve ag guvenligi";
        Course course = new Course("986", courseName, true);
        Assignments instance = new GroupProject("12/12/2016","30/12/2016",8);
        instance.setCourseName(course);
    }

    /**
     * Test of howManyStudent method, of class Assignments.
     */
    @Test
    public void testHowManyStudent() {
        System.out.println("howManyStudent");
        Assignments instance = new GroupProject("11/11/2016", "12/12/2016", 7);
        int expResult = 7;
        instance.setManyPeople(expResult);
        int result = instance.howManyStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Assignments.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course course = new Course();
        course.setCourseName("null");
        course.setCourseID("12334");
        Assignments instance = new Homework("14/10/2016", "20/10/2016");
        String expResult = "Course Name: " + course.getCourseName()
                + ", Deadline: " + instance.getDeadline() + ", Late Deadline: " + instance.getLateDeadline()
                + ", Many People: " + instance.howManyStudent();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManyPeople method, of class Assignments.
     */
    @Test
    public void testSetManyPeople() {
        System.out.println("setManyPeople");
        int manyPeople = 1;
        Assignments instance = new Quiz("11/11/2016", "12/12/2016");
        instance.setManyPeople(manyPeople);
    }

    /**
     * Test of getManyPeople method, of class Assignments.
     */
    @Test
    public void testGetManyPeople() {
        System.out.println("getManyPeople");
        Assignments instance = new Homework("11/11/2016", "12/12/2016");
        int expResult = 1;
        int result = instance.howManyStudent();
        assertEquals(expResult, result);
    }

    
}
