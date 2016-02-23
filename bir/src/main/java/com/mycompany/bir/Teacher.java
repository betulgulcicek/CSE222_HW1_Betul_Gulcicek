package com.mycompany.bir;

import java.util.Scanner;

/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:08
 */
public class Teacher extends Users {

    private Course giveCourse;
    private Student student;
    private Tutor tutor;
    Assignments assignment;

    public Teacher() {
        super();
        this.giveCourse = giveCourse;
    }

    public Teacher(String userID, String userName, String email) {
        super(userID, userName, email);
        setCourse(giveCourse);
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

    /**
     * @return the giveCourse
     */
    public Course getCourse() {
        return giveCourse;
    }

    /**
     * @param giveCourse the giveCourse to set
     */
    public void setCourse(Course giveCourse) {
        this.giveCourse = giveCourse;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the tutor
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void addStudent(Student s) {
        getCourse().addStudent(s, true);
    }

    public void removeStudent(String id) {
        getCourse().removeStudent(id);
    }

    public void addTutor(Tutor t) {
        getCourse().addTutor(t, true);
    }

    public void removeTutor(String id) {
        getCourse().removeTutor(id);
    }

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

        System.out.println("Course Name: " + sCourseName + " "/* giveCourse.getCourseName()*/ + assignment.toString());
    }

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

        System.out.println("Course Name: " + sCourseName + " "/*giveCourse.getCourseName()*/ + assignment.toString());

    }

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

        System.out.println("Course Name: " + sCourseName + " "/* giveCourse.getCourseName()*/ + assignment.toString());

    }
}
