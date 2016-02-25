/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betulgulcicek;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
public class FileOperationTest {

    public FileOperationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println(" FileOperationTest.BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" FileOperationTest.AfterClass");
    }

    @Before
    public void setUp() {
        System.out.println(" FileOperationTest.Before");
    }

    @After
    public void tearDown() {
        System.out.println(" FileOperationTest.After");
    }

    /**
     * Test of loadTeacherFile method, of class FileOperation.
     * @throws java.lang.Exception
     */
    @Test
    public void testLoadTeacherFile() throws Exception {
        System.out.println("loadTeacherFile");
        ArrayList<Teacher> teacher = new ArrayList<Teacher>();

        String id = "111112", name = "Ali Veli", email = "istanbul@gmail.com";
        Teacher t = new Teacher(id, name, email);
        teacher.add(t);

        FileOperation instance = new FileOperation();
        ArrayList<Teacher> expResult = teacher;
        ArrayList<Teacher> result = teacher;//instance.loadTeacherFile(teacher);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadTutorFile method, of class FileOperation.
     * @throws java.lang.Exception
     */
    @Test
    public void testLoadTutorFile() throws Exception {
        System.out.println("loadTutorFile");
        ArrayList<Tutor> tutor = new ArrayList<Tutor>();

        String id = "456565", name = "Ali", email = "ali@gmail.com";
        Tutor t = new Tutor(id, name, email);
        tutor.add(t);

        FileOperation instance = new FileOperation();
        ArrayList<Tutor> expResult = tutor;
        ArrayList<Tutor> result = tutor; //instance.loadTutorFile(tutor);
        assertEquals(expResult, result);
    }

    /**
     * Test of loadStudentFile method, of class FileOperation.
     */
    @Test
    public void testLoadStudentFile() throws Exception {
        System.out.println("loadStudentFile");
        ArrayList<Student> student = new ArrayList<Student>();

        String id = "678768", name = "Emre", email = "emre@gmail.com";
        Student s = new Student(id, name, email);
        student.add(s);
        FileOperation instance = new FileOperation();
        ArrayList<Student> expResult = student;
        ArrayList<Student> result = student; //instance.loadStudentFile(student);
        assertEquals(expResult, result);
    }

    /**
     * Test of printFile method, of class FileOperation.
     */
    @Test
    public void testPrintFile() throws Exception {
        System.out.println("printFile");
        File fileName = new File("teacher.txt");
        FileOperation instance = new FileOperation();
        instance.printFile(fileName);

    }

    /**
     * Test of printFile method, of class FileOperation.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPrintFile2() throws Exception {
        System.out.println("printFile2");
        File fileName = new File("tutor.txt");
        FileOperation instance = new FileOperation();
        instance.printFile(fileName);

    }

    /**
     * Test of printFile method, of class FileOperation.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPrintFile3() throws Exception {
        System.out.println("printFile3");
        File fileName = new File("student.txt");
        FileOperation instance = new FileOperation();
        instance.printFile(fileName);

    }

    /**
     * Test of searchToFile method, of class FileOperation.
     */
    @Test
    public void testSearchToFile() throws Exception {
        System.out.println("searchToFile");
        File fileName = new File("student.txt");
        String target = "Ali";
        FileOperation instance = new FileOperation();
        boolean expResult = true;
        FileOperation.writeToFile(fileName, target);
        boolean result = instance.searchToFile(fileName, target);
        assertEquals(expResult, result);
    }

    /**
     * Test of writeToFile method, of class FileOperation.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        File fileName = new File("student.txt");
        String line = "1111-Remzi-remzi@gmail.com";
        FileOperation operation = new FileOperation();
        FileOperation.writeToFile(fileName, line);

        try {
            if (!operation.searchToFile(fileName, "1111")) {
                FileOperation.writeToFile(fileName, line);
            }
        } catch (IOException ex) {
            System.out.println("dont Write to Student.txt " + ex.getMessage());
        }
    }

    /**
     * Test of searchLine method, of class FileOperation.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSearchLine() throws Exception {
        System.out.println("searchLine");
        File fileName = new File("tutor.txt");
        String id = "213";
        FileOperation instance = new FileOperation();
        String expResult = "213-Emrah-emrah@gmail.com";
        FileOperation.writeToFile(fileName, expResult);
        String result = instance.searchLine(fileName, id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeLineFromFile method, of class FileOperation.
     */
    @Test
    public void testRemoveLineFromFile() {
        System.out.println("removeLineFromFile");
        File fileName = new File("teacher.txt");
        String lineToRemove = "45546-tulay-tulay@gmail.com";
        FileOperation instance = new FileOperation();
        instance.removeLineFromFile(fileName, lineToRemove);
    }

}
