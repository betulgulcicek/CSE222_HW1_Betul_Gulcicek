package com.betulgulcicek;

import java.util.Scanner;

/**
 *
 * @author Betul Gulcicek
 */

public class Teacher implements Users {

    private Course giveCourse;
    private Student student;
    private Tutor tutor;
    Assignments assignment;
    private String userID;
    private String userName;
    private String email;

    /**
     * no parameter constructor
     */
    public Teacher() {
        userID = "";
        userName = "";
        email = "";
        this.giveCourse = giveCourse;
    }

     /**
     * constructor
     *
     * @param userID teacher id - string value
     * @param userName teacher name - string value
     * @param email teacher email - string value
     */
    public Teacher(String userID, String userName, String email) {
         this.userID = userID;
        this.userName = userName;
        this.email = email;
        setCourse(giveCourse);
    }

    /**
     * adding books system by teacher
     */
    public void addBooks() {
        System.out.println("Add Books");
    }
    /**
     *  adding files system by teacher
     */
    public void addFiles() {
        System.out.println("Add Files");
    }
    /**
     *  adding slides system by teacher
     */
    public void addSlides() {
        System.out.println("Add Slides");
    }
    /**
     *  removing whiteboard descriptions from system by teacher
     */
    public void removeWhiteboardDescriptions() {
        System.out.println("Add Whiteboard Descriptions");
    }
    /**
     * adding urls system by teacher
     */
    public void addUrls() {
        System.out.println("Add Urls");
    }
    /**
     * removing books from system by teacher
     */
    public void removeBooks() {
        System.out.println("Remove Books");
    }
    /**
     * removing files from system by teacher
     */
    public void removeFiles() {
        System.out.println("Remove Files");
    }
    /**
     * removing slides from system by teacher
     */
    public void removeSlides() {
        System.out.println("Remove Slides");
    }
    /**
     * removing urls from system by teacher
     */
    public void removeUrls() {
        System.out.println("Remove Urls");
    }

    /**
     * getter method for give course by teacher
     * @return the giveCourse - Course object
     */
    public Course getCourse() {
        return giveCourse;
    }

    /**
     * setter method for give course by teacher 
     * @param giveCourse the giveCourse to set - Course object
     */
    public void setCourse(Course giveCourse) {
        this.giveCourse = giveCourse;
    }

    /**
     * getter method for student
     * @return the student - Student object
     */
    public Student getStudent() {
        return student;
    }

    /**
     * setter method for student
     * @param student the student to set - Student object
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * getter method for tutor
     * @return the tutor - Tutor object
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * seter method for tutor
     * @param tutor the tutor to set - Tutor object
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    /**
     * adding student by teacher
     * @param s Student object
     */
    public void addStudent(Student s) {
        getCourse().addStudent(s, true);
    }
    /**
     * removing student by teacher 
     * @param id student id - string value
     */
    public void removeStudent(String id) {
        getCourse().removeStudent(id);
    }
    /**
     * adding tutor by teacher
     * @param t Tutor object
     */
    public void addTutor(Tutor t) {
        getCourse().addTutor(t, true);
    }
    /**
     * removing tutor by teacher 
     * @param id tutor id - string value
     */
    public void removeTutor(String id) {
        getCourse().removeTutor(id);
    }
    /**
     * homework assignment yapan method
     */
    void homeworkAssignments() {
        assignment = new Homework("", "");

        System.out.println("Which is the giveCourse name?");

        Scanner scanner = new Scanner(System.in);
        String sCourseName = scanner.nextLine();

        // giveCourse.setCourseName(sCourseName);
        System.out.println("When the Homework deadline?");

        String sDeadline = scanner.nextLine();

        assignment.setDeadline(sDeadline);

        System.out.println("When the Homework late deadline?");

        String sLateDeadline = scanner.nextLine();

        assignment.setLateDeadline(sLateDeadline);

        assignment.howManyStudent();

        System.out.println("Course Name: " + sCourseName + " "+ assignment.toString());
    }
/**
 * quiz assignment yapan method
 */
    void quizAssignments() {

        assignment = new Quiz("", "");

        System.out.println("Which is the giveCourse name?");

        Scanner scanner = new Scanner(System.in);
        String sCourseName = scanner.nextLine();

        // giveCourse.setCourseName(sCourseName);
        System.out.println("When the Quiz deadline?");

        String sDeadline = scanner.nextLine();

        assignment.setDeadline(sDeadline);

        System.out.println("When the Quiz late deadline?");

        String sLateDeadline = scanner.nextLine();

        assignment.setLateDeadline(sLateDeadline);

        assignment.howManyStudent();

        System.out.println("Course Name: " + sCourseName + " " + assignment.toString());

    }

    /**
     * group project assignment yapan method
     */
    void groupProjectAssignments() {
        assignment = new GroupProject("", "", 0);

        System.out.println("Which is the giveCourse name?");

        Scanner scanner = new Scanner(System.in);
        String sCourseName = scanner.nextLine();

        // giveCourse.setCourseName(sCourseName);
        System.out.println("When the Group Project deadline?");

        String sDeadline = scanner.nextLine();

        assignment.setDeadline(sDeadline);

        System.out.println("When the Group Project late deadline?");

        String sLateDeadline = scanner.nextLine();

        assignment.setLateDeadline(sLateDeadline);

        System.out.println("How many people the project?");

        String input = scanner.nextLine();
        int iChoice = Integer.parseInt(input);

        assignment.setManyPeople(iChoice);

        assignment.setManyPeople(assignment.howManyStudent());

        System.out.println("Course Name: " + sCourseName + " " + assignment.toString());

    }

    @Override
    public void enrolOperations() {
        System.out.println(getUserName() + " Successful Enrol ");
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
