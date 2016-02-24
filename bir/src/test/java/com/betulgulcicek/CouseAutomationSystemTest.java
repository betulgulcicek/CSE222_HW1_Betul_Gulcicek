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
public class CouseAutomationSystemTest {
    
    public CouseAutomationSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CouseAutomationSystemTest.BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("CouseAutomationSystemTest.AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("CouseAutomationSystemTest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("CouseAutomationSystemTest.After");
    }

    /**
     * Test of addTeacher method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        Teacher t = new Teacher("213", "ayse", "ayse@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addTeacher(t);
    }

    /**
     * Test of addStudent method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("5666556", "aysenur", "aysenur@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addStudent(s);
    }

    /**
     * Test of addTutor method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddTutor() {
        System.out.println("addTutor");
        Tutor t = new Tutor("56767", "turan", "turan@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addTutor(t);
    }

    /**
     * Test of removeTeacher method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveTeacher() {
        System.out.println("removeTeacher");
        String id = "435";
        Teacher t = new Teacher(id, "ayse", "ayse@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addTeacher(t);
        instance.removeTeacher(id);
    }

    /**
     * Test of removeStudent method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        String id = "76";
        Student s = new Student(id, "aysenur", "aysenur@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addStudent(s);
        instance.removeStudent(id);
    }

    /**
     * Test of removeTutor method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        String id = "56767";
        Tutor t = new Tutor(id, "turan", "turan@gmail.com");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addTutor(t);
        instance.removeTutor(id);
    }

    /**
     * Test of addCourse method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course c = new Course("1", "Bilgisayara Giris", true);
        boolean condition = false;
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addCourse(c, condition);
    }

    /**
     * Test of removeCourse method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        String courseId = "";
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeCourse(courseId);
    }

    /**
     * Test of learnAboutCourses method, of class CouseAutomationSystem.
     */
    @Test
    public void testLearnAboutCourses() {
        System.out.println("learnAboutCourses");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.learnAboutCourses();
    }

    /**
     * Test of getInformationUsers method, of class CouseAutomationSystem.
     */
    @Test
    public void testGetInformationUsers() {
        System.out.println("getInformationUsers");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.getInformationUsers();
    }

    /**
     * Test of getInformationCouruses method, of class CouseAutomationSystem.
     */
    @Test
    public void testGetInformationCouruses() {
        System.out.println("getInformationCouruses");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.getInformationCouruses();
    }

    /**
     * Test of addBooks method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddBooks() {
        System.out.println("addBooks");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addBooks();
    }

    /**
     * Test of addFiles method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddFiles() {
        System.out.println("addFiles");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addFiles();
    }

    /**
     * Test of addSlides method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddSlides() {
        System.out.println("addSlides");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addSlides();
    }

    /**
     * Test of removeWhiteboardDescriptions method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveWhiteboardDescriptions() {
        System.out.println("removeWhiteboardDescriptions");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeWhiteboardDescriptions();
    }

    /**
     * Test of addUrls method, of class CouseAutomationSystem.
     */
    @Test
    public void testAddUrls() {
        System.out.println("addUrls");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.addUrls();
    }

    /**
     * Test of removeBooks method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveBooks() {
        System.out.println("removeBooks");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeBooks();
    }

    /**
     * Test of removeFiles method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveFiles() {
        System.out.println("removeFiles");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeFiles();
    }

    /**
     * Test of removeSlides method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveSlides() {
        System.out.println("removeSlides");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeSlides();
    }

    /**
     * Test of removeUrls method, of class CouseAutomationSystem.
     */
    @Test
    public void testRemoveUrls() {
        System.out.println("removeUrls");
        CouseAutomationSystem instance = new CouseAutomationSystem();
        instance.removeUrls();
    }
    
}
