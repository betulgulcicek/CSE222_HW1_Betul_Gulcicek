package com.mycompany.bir;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:07
 */
public class CouseAutomationSystem {

    public FileOperation m_FileOperation = new FileOperation();

    private ArrayList<Users> user;
    private ArrayList<Teacher> teacher;
    private ArrayList<Student> student;
    private ArrayList<Tutor> tutor;
    private ArrayList<Course> course;

    File userFile = new File("user.txt");
    File adminFile = new File("admin.txt");
    File teacherFile = new File("teacher.txt");
    File tutorFile = new File("tutor.txt");
    File studentFile = new File("student.txt");
    File assignmentFile = new File("assignment.txt");
    File courseFile = new File("course.txt");

    public CouseAutomationSystem() {
        user = new ArrayList<Users>();
        course = new ArrayList<Course>();
        teacher = new ArrayList<Teacher>();
    }

    public void addTeacher(Teacher t) {

            teacher.add(t);
            user.add(t);
            String line = "teacher" + "-" + t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
            m_FileOperation.writeToFile(teacherFile, line);

    }

    public void addStudent (Student s) {

            student.add(s);
            user.add(s);
            String line = "student" + "-" + s.getUserID() + "-" + s.getUserName() + "-" + s.getEmail();
            m_FileOperation.writeToFile(studentFile, line);
    }

    public void addTutor( Tutor t) {
         tutor.add(t);
            user.add(t);
            String line = "tutor" + "-" + t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
            m_FileOperation.writeToFile(tutorFile, line);

    }

    public void removeTeacher(String id) {
        boolean isPresent = false;

        int i, sizeTeacher, sizeUser;
        sizeTeacher = teacher.size();
        sizeUser = user.size();

        if (sizeTeacher == 0) {
            System.out.println("There is no teacher the system");
        } else {
            for (i = 0; i < sizeTeacher; i++) {
                if (teacher.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    teacher.remove(i);

                }
            }
            for (i = 0; i < sizeUser; i++) {
                if (user.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    user.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    public void removeStudent(String id) {
        boolean isPresent = false;

        int i, listSize, sizeUser;
        listSize = student.size();
        sizeUser = user.size();

        if (listSize == 0) {
            System.out.println("There is no student the system");
        } else {
            for (i = 0; i < listSize; i++) {
                if (student.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    student.remove(i);

                }
            }
            for (i = 0; i < sizeUser; i++) {
                if (user.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    user.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    public void removeTutor(String id) {
        boolean isPresent = false;

        int i, listSize, sizeUser;
        listSize = tutor.size();
        sizeUser = user.size();

        if (listSize == 0) {
            System.out.println("There is no tutor the system");
        } else {
            for (i = 0; i < listSize; i++) {
                if (tutor.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    tutor.remove(i);

                }
            }
            for (i = 0; i < sizeUser; i++) {
                if (user.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    user.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    public void addCourse(Course c, boolean condition) {

        boolean flag = true;

        int i, listSize;
        listSize = course.size();

        for (i = 0; i < listSize; i++) {
            if (course.get(i).getCourseID().equals(c.getCourseID())) {
                flag = false;
                System.out.println(c.getCourseID() + " is already courses");

            }
        }
        if (flag == true) {
            course.add(c);
            String line = c.getCourseID() + "-" + c.getCourseName();
            if (condition) {
                m_FileOperation.writeToFile(courseFile, line);
            }
        }
    }

    public void removeCourse(String courseId) {
        boolean isPresent = false;

        int i, listSize;
        listSize = course.size();

        if (listSize == 0) {
            System.out.println("There are no course in the system");
        } else {
            for (i = 0; i < listSize; i++) {
                if (course.get(i).getCourseID().equals(courseId)) {
                    isPresent = true;
                    course.remove(i);
                }
            }
            if (isPresent == false) {
                System.out.println(courseId + " not found system");
            }
        }
    }

    public void learnAboutCourses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getInformationUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getInformationCouruses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addBooks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addFiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addSlides() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeWhiteboardDescriptions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addUrls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeBooks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeFiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeSlides() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeUrls() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
