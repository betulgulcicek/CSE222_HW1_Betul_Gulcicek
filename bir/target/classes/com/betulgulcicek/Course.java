package com.betulgulcicek;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Betul Gulcicek
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

    /**
     * no parameter constructor
     */
    public Course() {
        courseID = "";
        courseName = "";
        isCourseActive = false;
    }

    /**
     * three parameter constructor
     *
     * @param courseID course id - string value
     * @param courseName course name - string value
     * @param isCourseActive course active or passive - boolean value
     */
    public Course(String courseID, String courseName, boolean isCourseActive) {

        this.courseID = courseID;
        this.courseName = courseName;
        this.isCourseActive = isCourseActive;

        teacher = new ArrayList<Teacher>();
        student = new ArrayList<Student>();
        tutor = new ArrayList<Tutor>();
    }

    /**
     * getter method for course id
     *
     * @return the courseID course id - string value
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * setter method for course id
     *
     * @param courseID the courseID to set
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * getter method for course name
     *
     * @return the courseName course name - string value
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * setter method for course name
     *
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * getter method for course active or passive
     *
     * @return the isCourseActive course active or passive - boolean value
     */
    public boolean getIsCourseActive() {
        return isCourseActive;
    }

    /**
     * setter method for course active
     *
     * @param isCourseActive the isCourseActive to set
     */
    public void setIsCourseActive(boolean isCourseActive) {
        this.isCourseActive = isCourseActive;
    }

    /**
     * adding teachers to course
     *
     * @param t teacher object
     * @param condition condition for write to teacher.txt file - boolean value
     */
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

    /**
     * adding students to course
     *
     * @param s student object
     * @param condition condition for write to student.txt file - boolean value
     */
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

    /**
     * adding tutors to course
     *
     * @param t tutor object
     * @param condition condition for write to tutor.txt file - boolean value
     */
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

    /**
     * removing teacher from course
     *
     * @param id teacher id - string value
     */
    public void removeTeacher(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = teacher.size();

        if (listSize == 0) {
            System.out.println("Nobody teacher");
        } else {
            for (i = 0; i < listSize - 1; i++) {
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

    /**
     * removing student from course
     *
     * @param id student id - string value
     */
    public void removeStudent(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = student.size();

        if (listSize == 0) {
            System.out.println("Nobody course");
        } else {
            for (i = 0; i < listSize - 1; i++) {
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

    /**
     * removing tutor from course
     *
     * @param id tutor id - string value
     */
    public void removeTutor(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = tutor.size();

        if (listSize == 0) {
            System.out.println("Nobody course");
        } else {
            for (i = 0; i < listSize - 1; i++) {
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

    /**
     * information about the course to show users
     */
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
