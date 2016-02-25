package com.betulgulcicek;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Betul Gulcicek
 */
public class CouseAutomationSystem {

    private FileOperation fileOperation = new FileOperation();

    private ArrayList<Teacher> teacher;
    private ArrayList<Student> student;
    private ArrayList<Tutor> tutor;
    private ArrayList<Course> course;

    File teacherFile = new File("teacher.txt");
    File tutorFile = new File("tutor.txt");
    File studentFile = new File("student.txt");
    File courseFile = new File("course.txt");

    /**
     * no parameter constructor
     */
    public CouseAutomationSystem() {
        student = new ArrayList<Student>();
        course = new ArrayList<Course>();
        teacher = new ArrayList<Teacher>();
        tutor = new ArrayList<Tutor>();
    }

    /**
     * adding about the teacher to teacher.txt file
     *
     * @param t Teacher object
     */
    public void addTeacher(Teacher t) {
        teacher.add(t);
        String line = "teacher" + "-" + t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
        fileOperation.writeToFile(teacherFile, line);

    }

    /**
     * adding about the student to student.txt file
     *
     * @param s Student object
     */
    public void addStudent(Student s) {
        student.add(s);
        String line = "student" + "-" + s.getUserID() + "-" + s.getUserName() + "-" + s.getEmail();
        fileOperation.writeToFile(studentFile, line);
    }

    /**
     * adding about the tutor to tutor.txt file
     *
     * @param t Tutor object
     */
    public void addTutor(Tutor t) {
        tutor.add(t);
        String line = "tutor" + "-" + t.getUserID() + "-" + t.getUserName() + "-" + t.getEmail();
        fileOperation.writeToFile(tutorFile, line);

    }

    /**
     * removing teacher for system to teacher.txt file
     *
     * @param id teacher id - string value
     */
    public void removeTeacher(String id) {
        boolean isPresent = false;

        int i, sizeTeacher;
        sizeTeacher = teacher.size();

        if (sizeTeacher == 0) {
            System.out.println("There is no teacher the system");
        } else {
            for (i = 0; i < sizeTeacher; i++) {
                if (teacher.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    teacher.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    /**
     * removing student for system to student.txt file
     *
     * @param id student id - string value
     */
    public void removeStudent(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = student.size();

        if (listSize == 0) {
            System.out.println("There is no student the system");
        } else {
            for (i = 0; i < listSize; i++) {
                if (student.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    student.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    /**
     * removing tutor for system to tutor.txt file
     *
     * @param id tutor id - string value
     */
    public void removeTutor(String id) {
        boolean isPresent = false;

        int i, listSize;
        listSize = tutor.size();

        if (listSize == 0) {
            System.out.println("There is no tutor the system");
        } else {
            for (i = 0; i < listSize; i++) {
                if (tutor.get(i).getUserID().equals(id)) {
                    isPresent = true;
                    tutor.remove(i);

                }
            }
            if (isPresent == false) {
                System.out.println(id + " not found the system");
            }
        }
    }

    /**
     * adding course the system to course.txt file
     *
     * @param c Course object
     * @param condition condition for write to course.txt file
     */
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
                fileOperation.writeToFile(courseFile, line);
            }
        }

    }

    /**
     * removing course from system to course.txt file
     *
     * @param courseId course id - string value
     */
    public void removeCourse(String courseId) {
        boolean isPresent = false;

        int i, listSize;
        listSize = course.size();

        if (listSize == 0) {
            System.out.println("There are no course in the system");
        } else {
            for (i = 0; i < listSize - 1; i++) {
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

    /**
     * learn about courses
     */
    public void learnAboutCourses() {
    }

    /**
     * get information users
     */
    public void getInformationUsers() {
    }

    /**
     * get information courses
     */
    public void getInformationCouruses() {

    }

    /**
     * add books by admin
     */
    public void addBooks() {

    }

    /**
     * add files by admin
     */
    public void addFiles() {

    }

    /**
     * add slides by admin
     */
    public void addSlides() {

    }

    /**
     * remove whiteboard descriptions by admin
     */
    public void removeWhiteboardDescriptions() {

    }

    /**
     * add urls by admin
     */
    public void addUrls() {

    }

    /**
     * remove books
     */
    public void removeBooks() {

    }

    /**
     * remove files
     */
    public void removeFiles() {

    }

    /**
     * remove slides
     */
    public void removeSlides() {

    }

    /**
     * remove urls
     */
    public void removeUrls() {

    }

}
