/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betulgulcicek;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author GULCICEK
 */
public class Course {

    private String courseID;
    private String courseName;
    private boolean isCourseActive;

    private ArrayList<Teacher> teacher;
    private ArrayList<Student> student;
    private ArrayList<Tutor> tutor;

    private FileOperation fileOperation = new FileOperation();

    File teacherFile = new File("teacher.txt");
    File tutorFile = new File("tutor.txt");
    File studentFile = new File("student.txt");

    public Course() {
        courseID = "";
        courseName = "";
        isCourseActive = false;
    }

    public Course(String courseID, String courseName, boolean isCourseActive) {

        this.courseID = courseID;
        this.courseName = courseName;
        this.isCourseActive = isCourseActive;

        teacher = new ArrayList<Teacher>();
        student = new ArrayList<Student>();
        tutor = new ArrayList<Tutor>();
    }

    /**
     * @return the courseID
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the isCourseActive
     */
    public boolean getIsCourseActive() {
        return isCourseActive;
    }

    /**
     * @param isCourseActive the isCourseActive to set
     */
    public void setIsCourseActive(boolean isCourseActive) {
        this.isCourseActive = isCourseActive;
    }

    public void addTeacher(Teacher t, boolean condition) {

        boolean flag = true;

        int i, listSize;
        listSize = teacher.size();

        for (i = 0; i < listSize; i++) {
            if (teacher.get(i).getUserID().equals(t.getUserID()) == true) {
                flag = false;
                System.out.println(t.getUserID() + " is already courses");
            }
        }
        if (flag == true) {
            teacher.add(t);
            String line = t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
            if (condition) {
                fileOperation.writeToFile(teacherFile, line);
            }

        }
    }

    public void addStudent(Student s, boolean condition) {

        boolean flag = true;

        int i, listSize;
        listSize = student.size();

        for (i = 0; i < listSize; i++) {
            if (student.get(i).getUserID().equals(s.getUserID()) == true) {
                flag = false;
                System.out.println(s.getUserID() + " is already courses");
            }
        }
        if (flag == true) {
            student.add(s);
            String line = s.getUserID() + "-" + s.getUserName() + "-" + s.getEmail();
            if (condition) {
                fileOperation.writeToFile(studentFile, line);
            }

        }
    }

    public void addTutor(Tutor t, boolean condition) {

        boolean flag = true;

        int i, listSize;
        listSize = tutor.size();

        for (i = 0; i < listSize; i++) {
            if (tutor.get(i).getUserID().equals(t.getUserID()) == true) {
                flag = false;
                System.out.println(t.getUserID() + " is already courses");
            }
        }
        if (flag == true) {
            tutor.add(t);
            String line = t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
            if (condition) {
                fileOperation.writeToFile(tutorFile, line);
            }

        }
    }

    public void removeTeacher(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = teacher.size();

        if (listSize == 0) {
            System.out.println("Nobody course");
        } else {
            for (i = 0; i < listSize; i++) {
                if (teacher.get(i).getUserID().equals(id) == true) {
                    isPresent = true;
                    teacher.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not be found in the course");
            }
        }
    }

    public void removeStudent(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = student.size();

        if (listSize == 0) {
            System.out.println("Nobody course");
        } else {
            for (i = 0; i < listSize; i++) {
                if (student.get(i).getUserID().equals(id) == true) {
                    isPresent = true;
                    student.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not be found in the course");
            }
        }
    }

    public void removeTutor(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = tutor.size();

        if (listSize == 0) {
            System.out.println("Nobody course");
        } else {
            for (i = 0; i < listSize; i++) {
                if (tutor.get(i).getUserID().equals(id) == true) {
                    isPresent = true;
                    tutor.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not be found in the course");
            }
        }
    }

    public void printCourse() {

        for (int i = 0; i < teacher.size(); i++) {
            System.out.println(teacher.get(i).toString());
        }
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
        for (int i = 0; i < tutor.size(); i++) {
            System.out.println(tutor.get(i).toString());
        }

    }

}
