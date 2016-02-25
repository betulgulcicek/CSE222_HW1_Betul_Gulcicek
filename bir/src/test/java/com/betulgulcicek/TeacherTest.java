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
public class TeacherTest {

    public TeacherTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println(" TeacherTest.BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" TeacherTest.AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println(" TeacherTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println(" TeacherTest.After");
    }

    /**
     * Test of addBooks method, of class Teacher.
     */
    @Test
    public void testAddBooks() {
        System.out.println("addBooks");
        Teacher instance = new Teacher("345", "Umut", "umut@gmail.com");
        instance.addBooks();
    }

    /**
     * Test of addFiles method, of class Teacher.
     */
    @Test
    public void testAddFiles() {
        System.out.println("addFiles");
        Teacher instance = new Teacher("345", "Yonca", "yonca@gmail.com");
        instance.addFiles();
    }

    /**
     * Test of addSlides method, of class Teacher.
     */
    @Test
    public void testAddSlides() {
        System.out.println("addSlides");
        Teacher instance = new Teacher("5466", "Yeliz", "yeliz@gmail.com");
        instance.addSlides();
    }

    /**
     * Test of removeWhiteboardDescriptions method, of class Teacher.
     */
    @Test
    public void testRemoveWhiteboardDescriptions() {
        System.out.println("removeWhiteboardDescriptions");
        Teacher instance = new Teacher("78", "Betul", "betul@gmail.com");
        instance.removeWhiteboardDescriptions();
    }

    /**
     * Test of addUrls method, of class Teacher.
     */
    @Test
    public void testAddUrls() {
        System.out.println("addUrls");
        Teacher instance = new Teacher("456", "Anil", "anil@gmail.com");
        instance.addUrls();
    }

    /**
     * Test of removeBooks method, of class Teacher.
     */
    @Test
    public void testRemoveBooks() {
        System.out.println("removeBooks");
        Teacher instance = new Teacher("657", "Rukan", "rukan@gmail.com");
        instance.removeBooks();
    }

    /**
     * Test of removeFiles method, of class Teacher.
     */
    @Test
    public void testRemoveFiles() {
        System.out.println("removeFiles");
        Teacher instance = new Teacher("800", "Aydin", "aydin@gmail.com");
        instance.removeFiles();
    }

    /**
     * Test of removeSlides method, of class Teacher.
     */
    @Test
    public void testRemoveSlides() {
        System.out.println("removeSlides");
        Teacher instance = new Teacher("57", "Kiraz", "kiraz@gmail.com");
        instance.removeSlides();
    }

    /**
     * Test of removeUrls method, of class Teacher.
     */
    @Test
    public void testRemoveUrls() {
        System.out.println("removeUrls");
        Teacher instance = new Teacher("678", "Hale", "hale@gmail.com");
        instance.removeUrls();
    }

    /**
     * Test of getCourse method, of class Teacher.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Teacher instance = new Teacher("456", "Anil", "anil@gmail.com");
        Course expResult = new Course("23", "Harita", true);
        expResult.addTeacher(instance, true);
        Course result = instance.getCourse();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Teacher.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course giveCourse = new Course("45", "Fizik", true);
        Teacher instance = new Teacher("6765", "Turan", "turan@gmail.com");
        instance.setCourse(giveCourse);
    }

    /**
     * Test of getStudent method, of class Teacher.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Teacher instance = new Teacher("78344", "Lale", "lale@gmail.com");
        Student expResult = new Student("45", "veli", "veli@gmail.com");
      
        Student result = instance.getStudent();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setStudent method, of class Teacher.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        Student student = new Student("45", "veli", "veli@gmail.com");
        Teacher instance = new Teacher("78344", "Lale", "lale@gmail.com");
        instance.setStudent(student);
    }

    /**
     * Test of getTutor method, of class Teacher.
     */
    @Test
    public void testGetTutor() {
        System.out.println("getTutor");
        Teacher instance = new Teacher("56465", "Akif", "akif@gmail.com");
        Tutor expResult = new Tutor("345", "Elif", "elif@gmail.com");
        
        Tutor result = instance.getTutor();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setTutor method, of class Teacher.
     */
    @Test
    public void testSetTutor() {
        System.out.println("setTutor");
        Tutor tutor = new Tutor("356", "ali", "ali@gmail.com");
        Teacher instance = new Teacher("34", "veli", "veli@gmail.com");
        instance.setTutor(tutor);
    }

    /**
     * Test of addStudent method, of class Teacher.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student s = new Student("356", "ali", "ali@gmail.com");
        Course instance = new Course("356", "Tatih",true);
        instance.addStudent(s, true);
    }

    /**
     * Test of removeStudent method, of class Teacher.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        String id = "456";
        Students s = new Student(id, "ali", "ali@gmail.com");
        Course instance = new Course("356", "Tatih",true);
        instance.removeStudent(id);
    }

    /**
     * Test of addTutor method, of class Teacher.
     */
    @Test
    public void testAddTutor() throws NullPointerException{
        System.out.println("addTutor");
        Tutor t = new Tutor("34", "selin", "selin@gmail.com");
        Course instance = new Course("356", "Tatih",true);
        instance.addTutor(t, true);
    }

    /**
     * Test of removeTutor method, of class Teacher.
     */
    @Test
    public void testRemoveTutor() {
        System.out.println("removeTutor");
        String id = "34";
        Tutor t = new Tutor(id, "selin", "selin@gmail.com");
        Course instance = new Course("356", "Tatih",true);
        instance.removeTutor(id);
    }

    /**
     * Test of homeworkAssignments method, of class Teacher.
     */
    @Test
    public void testHomeworkAssignments() {
      /*  System.out.println("homeworkAssignments");
        Teacher instance = new Teacher();
        instance.homeworkAssignments();*/
    }

    /**
     * Test of quizAssignments method, of class Teacher.
     */
    @Test
    public void testQuizAssignments() {
       /* System.out.println("quizAssignments");
        Teacher instance = new Teacher();
        instance.quizAssignments();*/
    }

    /**
     * Test of groupProjectAssignments method, of class Teacher.
     */
    @Test
    public void testGroupProjectAssignments() {
      /*  System.out.println("groupProjectAssignments");
        Teacher instance = new Teacher();
        instance.groupProjectAssignments();*/
    }

}
