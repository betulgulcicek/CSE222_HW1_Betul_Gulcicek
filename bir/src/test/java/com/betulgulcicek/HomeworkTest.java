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
public class HomeworkTest {

    public HomeworkTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println(" HomeworkTest.BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" HomeworkTest.AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println(" HomeworkTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println(" HomeworkTest.After");
    }

    /**
     * Test of howManyStudent method, of class Homework.
     */
    @Test
    public void testHowManyStudent() {
        System.out.println("howManyStudent");
        Homework instance = new Homework("01/01/2016", "02/02/2016");
        int expResult = 1;
        int result = instance.howManyStudent();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Homework.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Homework instance = new Homework("01/01/2016", "02/02/2016");
        String courseName = "Tarih";
        Course course = new Course();
        course.setCourseID("34");
        course.setCourseName(courseName);
        course.setIsCourseActive(true);
        instance.setCourseName(course);
        String expResult = "Course Name: " + instance.getCourseName().getCourseName()
                + ", Deadline: " + instance.getDeadline() + ", Late Deadline: " + instance.getLateDeadline()
                + ", Many People: " + instance.howManyStudent();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
