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
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CourseTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("CourseTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("CourseTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("CourseTest.After");
    }

    /**
     * Test of getCourseID method, of class Course.
     */
    @Test
    public void testGetCourseID() {
        System.out.println("getCourseID");
        Course instance = new Course();
        instance.setCourseID("6");
        String expResult = "6";
        String result = instance.getCourseID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseID method, of class Course.
     */
    @Test
    public void testSetCourseID() {
        System.out.println("setCourseID");
        String courseID = "79789";
        Course instance = new Course();
        instance.setCourseID(courseID);
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = new Course();
        instance.setCourseName("Tarih");
        String expResult = "Tarih";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        Course instance = new Course();
        instance.setCourseName(courseName);
    }

    /**
     * Test of getIsCourseActive method, of class Course.
     */
    @Test
    public void testGetIsCourseActive() {
        System.out.println("getIsCourseActive");
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.getIsCourseActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsCourseActive method, of class Course.
     */
    @Test
    public void testSetIsCourseActive() {
        System.out.println("setIsCourseActive");
        boolean isCourseActive = true;
        Course instance = new Course();
        instance.setIsCourseActive(isCourseActive);
    }

    /**
     * Test of addTeacher method, of class Course.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Teacher t = new Teacher("213", "ayse", "ayse@gmail.com");
        boolean condition = true;
        Course instance = new Course("444444", "Muzik", true);
        instance.addTeacher(t, condition);
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("213", "firat", "firat@gmail.com");
        boolean condition = true;
        Course instance = new Course("44444", "Sanat 2", true);
        instance.addStudent(s, condition);
    }

    /**
     * Test of addTutor method, of class Course.
     */
    @Test
    public void testAddTutor() {
        System.out.println("addTutor");
        Tutor t = new Tutor("456", "tuna", "tuna@gmail.com");
        boolean condition = true;
        Course instance = new Course("999999", "Genel Kultur", true);
        instance.addTutor(t, condition);
    }

    /**
     * Test of removeTeacher method, of class Course.
     */
    @Test
    public void testRemoveTeacher() {
        System.out.println("removeTeacher");
        String id = "9";
        Course instance =  new Course("111111", "Sanat", true);
        instance.addStudent(new Student(id, "tuna","tuna@gmail.com"), true);
        instance.removeTeacher(id);
    }

    /**
     * Test of removeStudent method, of class Course.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        String id = "78";
        Course instance = new Course("45657324", "Bilim", true);
        instance.addStudent(new Student(id, "gamze","gamze@gmail.com"), true);
        instance.removeStudent(id);
    }

    /**
     * Test of removeTutor method, of class Course.
     */
    @Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        String id = "1254789";
        Course instance = new Course("324", "Cografya", true);
        Tutor tutor = new Tutor(id, "ali","ali@gmail.com");
        instance.addTutor(tutor, true);
        instance.removeTutor(id);
    }

    /**
     * Test of printCourse method, of class Course.
     */
    @Test
    public void testPrintCourse() {
        System.out.println("printCourse");
        Course instance = new Course("676786", "Couse 1",true);
        instance.printCourse();
    }
    
}
