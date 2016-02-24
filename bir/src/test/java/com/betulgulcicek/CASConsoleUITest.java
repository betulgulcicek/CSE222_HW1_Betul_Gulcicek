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
public class CASConsoleUITest {
    
    public CASConsoleUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CASConsoleUITest.BeforeClass\n"
                + "Wait for Enter Console");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("CASConsoleUITest.AfterClass"
                + "User is redirected and it was they wanted");
    }
    
    @Before
    public void setUp() {
        System.out.println("CASConsoleUITest.Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("CASConsoleUITest.After");
    }

    /**
     * Test of processCommandsConsole method, of class CASConsoleUI.
     */
    @Test
    public void testProcessCommandsConsole() {
        System.out.println("processCommandsConsole");
        CASConsoleUI instance = new CASConsoleUI();
        instance.processCommandsConsole();
    }

    /**
     * Test of addTeacher method, of class CASConsoleUI.
     */
    @Test
    public void testAddTeacher() throws Exception {
        System.out.println("addTeacher");
        CASConsoleUI instance = new CASConsoleUI();
        instance.addTeacher();
    }

    /**
     * Test of addStudent method, of class CASConsoleUI.
     */
    @Test
    public void testAddStudent() throws Exception {
        System.out.println("addStudent");
        CASConsoleUI instance = new CASConsoleUI();
        instance.addStudent();
    }

    /**
     * Test of addTutor method, of class CASConsoleUI.
     */
    @Test
    public void testAddTutor() throws Exception {
        System.out.println("addTutor");
        CASConsoleUI instance = new CASConsoleUI();
        instance.addTutor();
    }

    /**
     * Test of removeTeacher method, of class CASConsoleUI.
     */
    @Test
    public void testRemoveTeacher() throws Exception {
        System.out.println("removeTeacher");
        CASConsoleUI instance = new CASConsoleUI();
        instance.removeTeacher();
    }

    /**
     * Test of removeStudent method, of class CASConsoleUI.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        System.out.println("removeStudent");
        CASConsoleUI instance = new CASConsoleUI();
        instance.removeStudent();
    }

    /**
     * Test of removeTutor method, of class CASConsoleUI.
     */
    @Test
    public void testRemoveTutor() throws Exception {
        System.out.println("removeTutor");
        CASConsoleUI instance = new CASConsoleUI();
        instance.removeTutor();
    }

    /**
     * Test of lookAtOldCourses method, of class CASConsoleUI.
     */
    @Test
    public void testLookAtOldCourses() {
        System.out.println("lookAtOldCourses");
        CASConsoleUI instance = new CASConsoleUI();
        instance.lookAtOldCourses();
  
 
    }

    /**
     * Test of learnAboutCourses method, of class CASConsoleUI.
     */
    @Test
    public void testLearnAboutCourses() {
        System.out.println("learnAboutCourses");
        CASConsoleUI instance = new CASConsoleUI();
        instance.learnAboutCourses();
  
           
    }

    /**
     * Test of uploadAssingmentOperations method, of class CASConsoleUI.
     */
    @Test
    public void testUploadAssingmentOperations() {
        System.out.println("uploadAssingmentOperations");
        CASConsoleUI instance = new CASConsoleUI();
        instance.uploadAssingmentOperations();
  
           
    }

    /**
     * Test of lookAtGrades method, of class CASConsoleUI.
     */
    @Test
    public void testLookAtGrades() {
        System.out.println("lookAtGrades");
        CASConsoleUI instance = new CASConsoleUI();
        instance.lookAtGrades();
  
           
    }

    /**
     * Test of lookAtLectureNotes method, of class CASConsoleUI.
     */
    @Test
    public void testLookAtLectureNotes() {
        System.out.println("lookAtLectureNotes");
        CASConsoleUI instance = new CASConsoleUI();
        instance.lookAtLectureNotes();
  
           
    }

    /**
     * Test of lookAtMaterialsAssignments method, of class CASConsoleUI.
     */
    @Test
    public void testLookAtMaterialsAssignments() {
        System.out.println("lookAtMaterialsAssignments");
        CASConsoleUI instance = new CASConsoleUI();
        instance.lookAtMaterialsAssignments();
  
           
    }

    /**
     * Test of processSenarios method, of class CASConsoleUI.
     */
    @Test
    public void testProcessSenarios() {
        System.out.println("processSenarios");
        CASConsoleUI instance = new CASConsoleUI();
        instance.processSenarios();
  
           
    }
    
}
