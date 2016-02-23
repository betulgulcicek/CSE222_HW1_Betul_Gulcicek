/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bir;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GULCICEK
 */
public class CASConsoleUI implements CASUserInterface {

    private FileOperation fileOperation;

    File teacherFile = new File("teacher.txt");
    File tutorFile = new File("tutor.txt");
    File studentFile = new File("student.txt");
    File assignmentFile = new File("assignment.txt");
    File courseFile = new File("  txt");

    //CouseAutomationSystem cas;
    public CASConsoleUI() {
        fileOperation = new FileOperation();
        //cas = new CouseAutomationSystem();
    }

    @Override
    public void processCommands() {
        System.out.println(
                "Course Automation System" + "\n"
                + "******************************************" + "\n"
                + "Who are you ?" + "\n"
                + "1-Admin" + "\n"
                + "2-Teacher" + "\n"
                + "3-Tutor" + "\n"
                + "4-Student" + "\n"
                + "5-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 5)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1: {
                try {
                    adminScreen();
                } catch (IOException ex) {
                    Logger.getLogger(CASConsoleUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 2:
                teacherScreen();
                break;
            case 3:
                tutorScreen();
                break;
            case 4:
                studentScreen();
                break;
            case 5:
                break;

            default: // Do nothing.
            }

    }

    private void adminScreen() throws IOException {
        System.out.println(
                "Admin Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Users Operations" + "\n"
                + "2-Course Operations" + "\n"
                + "3-Get Information" + "\n"
                + "4-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 4)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                adminUserOperations();
                break;
            case 2:
                courseOperations();
                break;
            case 3:
                getInformation();
                break;
            case 4:
                break;

            default: // Do nothing.
            }
    }

    private void teacherScreen() {
        System.out.println(
                "Teacher Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Users Operations" + "\n"
                + "2-Document to Course Operations" + "\n"
                + "3-Learn About Courses" + "\n"
                + "4-Look at Old Courses" + "\n"
                + "5-Assignment Operations" + "\n"
                + "6-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 6)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                teacherUserOperations();
                break;
            case 2:
                documentToCourseOperations();
                break;
            case 3:
                learnAboutCourses();
                break;
            case 4:
                lookAtOldCourses();
                break;
            case 5:
                assignmentsOperations();
                break;
            case 6:
                break;

            default: // Do nothing.
            }
    }

    private void tutorScreen() {
        Users user = new Tutor();
        System.out.println(
                "Tutor Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Enrol Operations" + "\n"
                + "2-Upload Assingment Operations" + "\n"
                + "3-Look at Grades" + "\n"
                + "4-Look at Lecture Notes" + "\n"
                + "5-Look at Course Materials and Assignments" + "\n"
                + "6-Look at Old Courses" + "\n"
                + "7-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 7)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                user.enrolOperations();
                break;
            case 2:
                uploadAssingmentOperations();
                break;
            case 3:
                lookAtGrades();
                break;
            case 4:
                lookAtLectureNotes();
                break;
            case 5:
                lookAtMaterialsAssignments();
                break;
            case 6:
                lookAtOldCourses();
                break;
            case 7:
                break;

            default: // Do nothing.
            }
    }

    private void studentScreen() {
        Users user = new Student();
        System.out.println(
                "Student Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Enrol Operations" + "\n"
                + "2-Upload Assingment Operations" + "\n"
                + "3-Look at Grades" + "\n"
                + "4-Look at Lecture Notes" + "\n"
                + "5-Look at Course Materials and Assignments" + "\n"
                + "6-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 6)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                user.enrolOperations();
                break;
            case 2:
                uploadAssingmentOperations();
                break;
            case 3:
                lookAtGrades();
                break;
            case 4:
                lookAtLectureNotes();
                break;
            case 5:
                lookAtMaterialsAssignments();
                break;
            case 6:
                break;

            default: // Do nothing.
            }
    }

    private void adminUserOperations() throws IOException {
        System.out.println(
                "User Operations Screen for Admin" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Add Teacher" + "\n"
                + "2-Add Student" + "\n"
                + "3-Add Tutor" + "\n"
                + "4-Remove Teacher" + "\n"
                + "5-Remove Student" + "\n"
                + "6-Remove Tutor" + "\n"
                + "7-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 7)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                addTeacher();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                addTutor();
                break;
            case 4:
                removeTeacher();
                break;
            case 5:
                removeStudent();
                break;
            case 6:
                removeTutor();
                break;
            case 7:
                break;

            default: // Do nothing.
            }
    }

    private void teacherUserOperations() {
        System.out.println(
                "User Operations Screen for Teacher" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Add Student" + "\n"
                + "2-Add Tutor" + "\n"
                + "3-Remove Student" + "\n"
                + "4-Remove Tutor" + "\n"
                + "5-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 5)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                addTutor();
                break;
            case 3:
                removeStudent();
                break;
            case 4:
                removeTutor();
                break;
            case 5:
                break;

            default: // Do nothing.
            }
    }

    private void courseOperations() {

        Admin admin = new Admin();

        System.out.println(
                "Course Operations Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Add Course" + "\n"
                + "2-Remove Course" + "\n"
                + "3-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 3)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                addCourse();
                break;
            case 2:
                removeCourse();
                break;
            case 3:
                break;

            default: // Do nothing.
            }
    }

    // admin icin
    private void getInformation() {
        System.out.println(
                "Get Informations Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Get information about Users" + "\n"
                + "2-Get information about Courses" + "\n"
                + "3-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 3)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                getInformationUsers();
                break;
            case 2:
                getInformationCouruses();
                break;
            case 3:
                break;

            default: // Do nothing.
            }
    }

    private void documentToCourseOperations() {

        Teacher teacher = new Teacher();
        System.out.println(
                "Document to Course Operations Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Add books" + "\n"
                + "2-Add files" + "\n"
                + "3-Add slides" + "\n"
                + "4-Add urls" + "\n"
                + "5-Add Whiteboard descriptions" + "\n"
                + "6-Remove books" + "\n"
                + "7-Remove files" + "\n"
                + "8-Remove slides" + "\n"
                + "9-Remove urls" + "\n"
                + "10-Remove Whiteboard descriptions" + "\n"
                + "11-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 11)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                teacher.addBooks();
                break;
            case 2:
                teacher.addFiles();
                break;
            case 3:
                teacher.addSlides();
                break;
            case 4:
                teacher.addUrls();
                break;
            case 5:
                teacher.removeWhiteboardDescriptions();
                break;
            case 6:
                teacher.removeBooks();
                break;
            case 7:
                teacher.removeFiles();
                break;
            case 8:
                teacher.removeSlides();
                break;
            case 9:
                teacher.removeUrls();
                break;
            case 10:
                teacher.removeWhiteboardDescriptions();
                break;
            case 11:
                break;

            default: // Do nothing.
            }
    }

    public void addTeacher() throws IOException {

        String message;
        Users user = new Users();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher ID");
        String newID = scanner.nextLine();
        user.setUserID(newID);

        if (newID != null) {
            try {
                if (fileOperation.searchToFile(teacherFile, newID)) {
                    System.out.println("Bu kisi zaten bulunmakta, Yeniden giriniz");
                    System.out.println("Enter Teacher ID");
                    newID = scanner.nextLine();
                    user.setUserID(newID);

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        System.out.println("Enter Name");
        String newName = scanner.nextLine();
        if (newName == null) {
            return;
        }

        System.out.println("Enter Email");
        String newEmail = scanner.nextLine();
        if (newEmail == null) {
            return;
        }
        System.out.println("Enter Verdigi Course ID");
        String courseID = scanner.nextLine();
        if (courseID != null) {
            try {
                if (fileOperation.searchToFile(courseFile, courseID)) {
                    System.out.println("Boyle bir course bulunamadi, Yeniden giriniz");
                    System.out.println("Enter Course");
                    courseID = scanner.nextLine();

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Teacher newTeacher = new Teacher(newID, newName, newEmail);
        course.addTeacher(newTeacher, true);

        message = newName + " add the system";
        System.out.println(message);

    }

    public void addStudent() {
        String message;
        Users user = new Users();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID");
        String newID = scanner.nextLine();
        user.setUserID(newID);

        if (newID != null) {
            try {
                if (fileOperation.searchToFile(studentFile, newID)) {
                    System.out.println("Bu kisi zaten bulunmakta, Yeniden giriniz");
                    System.out.println("Enter Student ID");
                    newID = scanner.nextLine();
                    user.setUserID(newID);

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        System.out.println("Enter Name");
        String newName = scanner.nextLine();
        if (newName == null) {
            return;
        }

        System.out.println("Enter Email");
        String newEmail = scanner.nextLine();
        if (newEmail == null) {
            return;
        }

        System.out.println("Enter Aldigi Course ID");
        String courseID = scanner.nextLine();
        if (courseID != null) {
            try {
                if (fileOperation.searchToFile(courseFile, courseID)) {
                    System.out.println("Boyle bir course bulunamadi, Yeniden giriniz");
                    System.out.println("Enter Course");
                    courseID = scanner.nextLine();

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Student newStudent = new Student(newID, newName, newEmail);
        course.addStudent(newStudent, true);

        message = newName + " add the system";
        System.out.println(message);
    }

    public void addTutor() {
        String message;
        Users user = new Users();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Tutor ID");
        String newID = scanner.nextLine();
        user.setUserID(newID);

        if (newID != null) {
            try {
                if (fileOperation.searchToFile(tutorFile, newID)) {
                    System.out.println("Bu kisi zaten bulunmakta, Yeniden giriniz");
                    System.out.println("Enter Tutor ID");
                    newID = scanner.nextLine();
                    user.setUserID(newID);

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        System.out.println("Enter Name");
        String newName = scanner.nextLine();
        if (newName == null) {
            return;
        }

        System.out.println("Enter Email");
        String newEmail = scanner.nextLine();
        if (newEmail == null) {
            return;
        }

        System.out.println("Enter Aldigi Course ID");
        String courseID = scanner.nextLine();
        if (courseID != null) {
            try {
                if (fileOperation.searchToFile(courseFile, courseID)) {
                    System.out.println("Boyle bir course bulunamadi, Yeniden giriniz");
                    System.out.println("Enter Course");
                    courseID = scanner.nextLine();

                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Tutor newTutor = new Tutor(newID, newName, newEmail);
        course.addTutor(newTutor, true);

        message = newName + " add the system";
        System.out.println(message);
    }

    public void removeTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeTutor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void lookAtOldCourses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void learnAboutCourses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void uploadAssingmentOperations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void lookAtGrades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void lookAtLectureNotes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void lookAtMaterialsAssignments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getInformationUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getInformationCouruses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assignmentsOperations() {

        Teacher teacher = new Teacher();

        System.out.println(
                "Assignment Operations Screen" + "\n"
                + "******************************************" + "\n"
                + "What would you like to do?" + "\n"
                + "1-Homework Assignments" + "\n"
                + "2-Quiz Assignments" + "\n"
                + "3-Group Project Assignments" + "\n"
                + "4-Exit");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        if (!(choice >= 1 && choice <= 4)) {
            System.out.println("Enter Again");
            input = scanner.nextLine();
            choice = Integer.parseInt(input);
        }

        switch (choice) {
            case 1:
                teacher.homeworkAssignments();
                break;
            case 2:
                teacher.quizAssignments();
                break;
            case 3:
                teacher.groupProjectAssignments();
                break;
            case 4:
                break;

            default: // Do nothing.
            }
    }

    private void addCourse() {
        String message;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Course ID");
        String newID = scanner.nextLine();
        if (newID != null) {
            try {
                if (fileOperation.searchToFile(courseFile, newID)) {
                    System.out.println(newID + " is already courses");
                    System.out.println("Enter Course ID");
                    newID = scanner.nextLine();
                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;
        }

        System.out.println("Enter Course Name");
        String newName = scanner.nextLine();
        if (newName == null) {
            return;
        }

        CouseAutomationSystem cas = new CouseAutomationSystem();
        Course course = new Course(newID, newName, true);
        cas.addCourse(course, true);

        message = newName + " add course";
        System.out.println(message);
    }

    private void removeCourse() {
        String message, message2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Course ID");
        String courseId = scanner.nextLine();

        if (courseId != null) {
            try {
                if (!fileOperation.searchToFile(courseFile, courseId)) {
                    message = courseId + ": not found course";
                    System.out.println(message);
                    System.out.println("Enter Course ID");
                    courseId = scanner.nextLine();

                } else {
                    CouseAutomationSystem cas = new CouseAutomationSystem();
                    cas.removeCourse(courseId);
                    fileOperation.removeLineFromFile(courseFile, fileOperation.searchLine(courseFile, courseId));
                }
            } catch (IOException ex) {
                ex.getMessage();
            }
        } else {
            return;

        }
        message2 = courseId + " remove course";
        System.out.println(message2);
    }

}
