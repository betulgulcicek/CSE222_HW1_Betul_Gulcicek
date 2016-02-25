package com.betulgulcicek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Betul Gulcicek
 */
public class CASConsoleUI implements CASUserInterface {

    private FileOperation fileOperation;

    File teacherFile = new File("teacher.txt");
    File tutorFile = new File("tutor.txt");
    File studentFile = new File("student.txt");
    File assignmentFile = new File("assignment.txt");
    File courseFile = new File("course.txt");

    /**
     * no parameter constructor
     */
    public CASConsoleUI() {
        fileOperation = new FileOperation();
    }

    @Override
    /**
     * The method directs users. Users can input in from the console
     */
    public void processCommandsConsole() {
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
            case 1:
                adminScreen();
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

    /**
     * admin screen What can admin
     */
    private void adminScreen() {
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

    /**
     * teacher screen What can teacher
     */
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

    /**
     * tutor screen What can tutor
     */
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

    /**
     * student screen What can student
     */
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

    /**
     * admin user operations screen for What can admin
     */
    private void adminUserOperations() {
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
                try {
                    addTeacher();
                } catch (FileNotFoundException ex) {
                    System.out.println("teacher.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            case 2:
                try {
                    addStudent();
                } catch (FileNotFoundException ex) {
                    System.out.println("student.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 3:
                try {
                    addTutor();
                } catch (FileNotFoundException ex) {
                    System.out.println("tutor.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 4:
                try {
                    removeTeacher();
                } catch (FileNotFoundException ex) {
                    System.out.println("teacher.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 5:
                try {
                    removeStudent();
                } catch (FileNotFoundException ex) {
                    System.out.println("student.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 6:
                try {
                    removeTutor();
                } catch (FileNotFoundException ex) {
                    System.out.println("tutor.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 7:
                break;

            default: // Do nothing.
            }
    }

    /**
     * teacher user operations screen for What can teacher
     */
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
                try {
                    addStudent();
                } catch (FileNotFoundException ex) {
                    System.out.println("student.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 2:
                try {
                    addTutor();
                } catch (FileNotFoundException ex) {
                    System.out.println("tutor.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 3:
                try {
                    removeStudent();
                } catch (FileNotFoundException ex) {
                    System.out.println("student.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 4:
                try {
                    removeTutor();
                } catch (FileNotFoundException ex) {
                    System.out.println("tutor.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 5:
                break;

            default: // Do nothing.
            }
    }

    /**
     * can ardd course, remove course
     */
    private void courseOperations() {

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
                try {
                    addCourse();
                } catch (FileNotFoundException ex) {
                    System.out.println("course.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            case 2:
                try {
                    removeCourse();
                } catch (FileNotFoundException ex) {
                    System.out.println("course.txt not found" + ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            case 3:
                break;

            default: // Do nothing.
            }
    }

    /**
     * get information to users and courses for admin
     */
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

    /**
     * can document to course operations by taecher add or remove books, files,
     * slides, urls, whiteboard descriptions
     */
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

    /**
     * Adding system teachers
     *
     * @throws FileNotFoundException not found teacher.txt file
     * @throws IOException for user input errors
     */
    public void addTeacher() throws FileNotFoundException, IOException {

        String message;
        Users user = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (fileOperation.searchToFile(teacherFile, teacherID)) {
                System.out.println("Bu kisi zaten bulunmakta, Yeniden giriniz");
                System.out.println("Enter Teacher ID");
                teacherID = scanner.nextLine();
                user.setUserID(teacherID);
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

            if (fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println("Not found this course, enter again");
                System.out.println("Enter Course");
                courseID = scanner.nextLine();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Teacher newTeacher = new Teacher(teacherID, newName, newEmail);
        course.addTeacher(newTeacher, true);

        message = newName + " add the system";
        System.out.println(message);
    }

    /**
     *
     * Adding system students
     *
     * @throws FileNotFoundException not found student.txt file
     * @throws IOException for user input errors
     */
    public void addStudent() throws FileNotFoundException, IOException {
        String message;
        Users user = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (fileOperation.searchToFile(studentFile, teacherID)) {
                System.out.println("already found, enter again");
                System.out.println("Enter Student ID");
                teacherID = scanner.nextLine();
                user.setUserID(teacherID);
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

            if (fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println("not found course, enter again");
                System.out.println("Enter Course");
                courseID = scanner.nextLine();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Student newStudent = new Student(teacherID, newName, newEmail);
        course.addStudent(newStudent, true);

        message = newName + " add the system";
        System.out.println(message);
    }

    /**
     *
     * Adding system tutor
     *
     * @throws FileNotFoundException not found tutor.txt file
     * @throws IOException for user input errors
     */
    public void addTutor() throws FileNotFoundException, IOException {
        String message;
        Users user = new Tutor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Tutor ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (fileOperation.searchToFile(tutorFile, teacherID)) {
                System.out.println("already found, enter again");
                System.out.println("Enter Tutor ID");
                teacherID = scanner.nextLine();
                user.setUserID(teacherID);
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

            if (fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println("not found course, enter again");
                System.out.println("Enter Course");
                courseID = scanner.nextLine();
            }
        } else {
            return;
        }

        Course course = new Course(courseID, "", false);
        Tutor newTutor = new Tutor(teacherID, newName, newEmail);
        course.addTutor(newTutor, true);

        message = newName + " add the system";
        System.out.println(message);
    }

    /**
     * remove teacher from system
     *
     * @throws FileNotFoundException not found teacher.txt file
     * @throws IOException for user input errors
     */
    public void removeTeacher() throws FileNotFoundException, IOException {
        String message, message2;
        Users user = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Teacher ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (!fileOperation.searchToFile(teacherFile, teacherID)) {
                message = teacherID + ": this person not found, enter again";
                System.out.println(message);
                System.out.println("Enter Teacher ID");
                teacherID = scanner.nextLine();

            } else {
                Course c = new Course("", "", true);
                c.removeTeacher(teacherID);

                fileOperation.removeLineFromFile(teacherFile, fileOperation.searchLine(teacherFile, teacherID));
            }
        } else {
            return;
        }
        message2 = teacherID + " remove course";
        System.out.println(message2);
    }

    /**
     * remove student from system
     *
     * @throws FileNotFoundException not found student.txt file
     * @throws IOException for user input errors
     */
    public void removeStudent() throws FileNotFoundException, IOException {
        String message, message2;
        Users user = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (!fileOperation.searchToFile(studentFile, teacherID)) {
                message = teacherID + ": this person not found, enter again";
                System.out.println(message);
                System.out.println("Enter Student ID");
                teacherID = scanner.nextLine();

            } else {
                Course c = new Course("", "", true);
                c.removeStudent(teacherID);

                fileOperation.removeLineFromFile(studentFile, fileOperation.searchLine(studentFile, teacherID));
            }
        } else {
            return;
        }
        message2 = teacherID + " remove course";
        System.out.println(message2);
    }

    /**
     * remove tutor from system
     *
     * @throws FileNotFoundException not found tutor.txt file
     * @throws IOException for user input errors
     */
    public void removeTutor() throws FileNotFoundException, IOException {
        String message, message2;
        Users user = new Tutor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Tutor ID");
        String teacherID = scanner.nextLine();
        user.setUserID(teacherID);

        if (teacherID != null) {

            if (!fileOperation.searchToFile(tutorFile, teacherID)) {
                message = teacherID + ": this person not found, enter again";
                System.out.println(message);
                System.out.println("Enter Tutor ID");
                teacherID = scanner.nextLine();

            } else {
                Course c = new Course("", "", true);
                c.removeTutor(teacherID);

                fileOperation.removeLineFromFile(tutorFile, fileOperation.searchLine(tutorFile, teacherID));
            }
        } else {
            return;
        }
        message2 = teacherID + " remove course";
        System.out.println(message2);
    }

    /**
     * look at old courses from system
     */
    public void lookAtOldCourses() {
    }

    /**
     * learn about courses from system
     */
    public void learnAboutCourses() {
    }

    /**
     * upload assingment operations on system
     */
    public void uploadAssingmentOperations() {
    }

    /**
     * look at grades from system
     */
    public void lookAtGrades() {
    }

    /**
     * look at lecture notes from system
     */
    public void lookAtLectureNotes() {
    }

    /**
     * look at materials assignments from system
     */
    public void lookAtMaterialsAssignments() {
    }

    /**
     * get information about users from system
     */
    private void getInformationUsers() {
    }

    /**
     * get information about courses from system
     */
    private void getInformationCouruses() {
    }

    /**
     * assignment operations by admin
     */
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

    /**
     * adding system courses
     *
     * @throws FileNotFoundException not found course.txt file
     * @throws IOException for user input errors
     */
    private void addCourse() throws FileNotFoundException, IOException {
        String message;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Course ID");
        String courseID = scanner.nextLine();
        if (courseID != null) {
            if (fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println(courseID + " is already courses");
                System.out.println("Enter Course ID");
                courseID = scanner.nextLine();
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
        Course course = new Course(courseID, newName, true);
        cas.addCourse(course, true);

        message = newName + " add course";
        System.out.println(message);
    }

    /**
     * removing courses from system
     *
     * @throws FileNotFoundException not found course.txt file
     * @throws IOException for user input errors
     */
    private void removeCourse() throws FileNotFoundException, IOException {
        String message, message2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Course ID");
        String courseId = scanner.nextLine();

        if (courseId != null) {

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

        } else {
            return;

        }
        message2 = courseId + " remove course";
        System.out.println(message2);
    }

    @Override
    /**
     * senarios for user there are four senario they by admin, by teacher, by
     * tutor, by student
     */
    public void processSenarios() {

        String courseID, courseName,
                teacherID, teacherName, teacherMail,
                studentID, studentName, studentMail,
                tutorID, tutorName, tutorMail;
        CouseAutomationSystem cas = new CouseAutomationSystem();
        Assignments assignment;
        FileOperation fileOperation = new FileOperation();

        // SENARIO 1
        System.out.println("SENARIO 1: " + "\n"
                + "Admin ve Yapabilecegi Isler" + "\n"
                + "****************************************" + "\n"
                + "a-Users Operations" + "\n"
                + "1-Add Teacher" + "\n");
        courseID = "35435";
        courseName = "Java";
        teacherID = "5769789";
        teacherName = "Meltem";
        teacherMail = "meltem@gmail.com";
        Course course = new Course(courseID, courseName, true);
        Teacher newTeacher = new Teacher(teacherID, teacherName, teacherMail);
        Teacher newTeacher2 = new Teacher("23", "Erkan", "erkan@gmail.com");
        Teacher newTeacher3 = new Teacher("456654", "Mustafa", "mustafa@gmail.com");
        try {
            course.addTeacher(newTeacher, true);
            course.addTeacher(newTeacher2, true);
            course.addTeacher(newTeacher3, true);
            fileOperation.printFile(teacherFile);
        } catch (FileNotFoundException ex) {
            System.out.println("teacher.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "2-Add Student" + "\n");
        studentID = "435435455";
        studentName = "Ali";
        studentMail = "ali@gmail.com";
        // my studnets
        Student newStudent = new Student(studentID, studentName, studentMail);
        Student newStudent2 = new Student("3454", "ayse", "ayse@gmail.com");
        Student newStudent3 = new Student("768", "fatma", "fatma@gmail.com");
        Student newStudent4 = new Student("787", "zaynep", "zeynep@gmail.com");

        try {
            // add students in course
            course.addStudent(newStudent, true);
            course.addStudent(newStudent2, true);
            course.addStudent(newStudent3, true);
            course.addStudent(newStudent4, true);
            fileOperation.printFile(studentFile);
        } catch (FileNotFoundException ex) {
            System.out.println("student.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "3-Add Tutor" + "\n");
        tutorID = "43";
        tutorName = "Atif";
        tutorMail = "atif@gmail.com";
        // my studnets
        Tutor newTutor = new Tutor(tutorID, tutorName, tutorMail);
        Tutor newTutor2 = new Tutor("343", "Rukiye", "rukiye@gmail.com");

        try {
            // add tutor in course
            course.addTutor(newTutor, true);
            course.addTutor(newTutor2, true);
            fileOperation.printFile(tutorFile);
        } catch (FileNotFoundException ex) {
            System.out.println("tutor.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "4-Remove Teacher" + "\n");
        try {
            if (teacherID != null) {

                if (!fileOperation.searchToFile(teacherFile, teacherID)) {
                    System.out.println("Teacher not found");

                } else {
                    course.removeTeacher(teacherID);

                    fileOperation.removeLineFromFile(teacherFile, fileOperation.searchLine(teacherFile, teacherID));
                    fileOperation.printFile(teacherFile);
                }
            } else {
                return;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("teacher.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "5-Remove Student" + "\n");
        try {
            if (studentID != null) {

                if (!fileOperation.searchToFile(studentFile, studentID)) {
                    System.out.println("Student not found");

                } else {
                    course.removeStudent(studentID);
                    course.removeStudent("34345456");

                    fileOperation.removeLineFromFile(studentFile, fileOperation.searchLine(studentFile, studentID));
                    fileOperation.printFile(studentFile);
                }
            } else {
                return;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("student.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "6-Remove Tutor" + "\n");
        try {
            if (tutorID != null) {

                if (!fileOperation.searchToFile(tutorFile, tutorID)) {
                    System.out.println("Tutor not found");

                } else {
                    course.removeTutor(tutorID);
                    course.removeTutor("343456");

                    fileOperation.removeLineFromFile(tutorFile, fileOperation.searchLine(tutorFile, tutorID));
                    fileOperation.printFile(tutorFile);
                }
            } else {
                return;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("tutor.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n\n" + "****************************************" + "\n"
                + "b-Course Operations" + "\n"
                + "1-Add Course" + "\n");

        Course course2 = new Course("34", "Turkce", true);

        try {

            if (fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println(courseID + " is already courses");
            } else {
                cas.addCourse(course, true);
                cas.addCourse(course2, true);
                fileOperation.printFile(courseFile);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("course.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n\n" + "****************************************" + "\n"
                + "2-Remove Course" + "\n");

        try {
            if (!fileOperation.searchToFile(courseFile, courseID)) {
                System.out.println(courseID + " not found");

            } else {

                cas.removeCourse(courseID);
                fileOperation.removeLineFromFile(courseFile, fileOperation.searchLine(courseFile, courseID));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("course.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // SENARIO 2
        System.out.println("SENARIO 2: " + "\n"
                + "Teacher ve Yapabilecegi Isler" + "\n"
                + "****************************************" + "\n"
                + "a-Users Operations" + "\n"
                + "\n\n" + "****************************************" + "\n"
                + "1-Add Student" + "\n");
        System.out.println("\n\n" + "****************************************" + "\n");

        Student newStudent5 = new Student("54656", "gokhan", "gokhan@gmail.com");

        try {
            // add students in course
            course.addStudent(newStudent5, true);
            fileOperation.printFile(studentFile);
        } catch (FileNotFoundException ex) {
            System.out.println("student.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "2-Add Tutor" + "\n");

        Tutor newTutor3 = new Tutor("67856", "Fatih", "fatih@gmail.com");

        try {
            // add tutor in course
            course.addTutor(newTutor3, true);
            fileOperation.printFile(tutorFile);
        } catch (FileNotFoundException ex) {
            System.out.println("tutor.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\n" + "****************************************" + "\n"
                + "3-Remove Student" + "\n");
        try {

            if (!fileOperation.searchToFile(studentFile, "54656")) {
                System.out.println("Student not found");

            } else {
                course.removeStudent("54656");

                fileOperation.removeLineFromFile(studentFile, fileOperation.searchLine(studentFile, "54656"));
                fileOperation.printFile(studentFile);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("student.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n" + "****************************************" + "\n"
                + "6-Remove Tutor" + "\n");
        try {
            if (tutorID != null) {

                if (!fileOperation.searchToFile(tutorFile, "67856")) {
                    System.out.println("Tutor not found");

                } else {
                    course.removeTutor("67856");

                    fileOperation.removeLineFromFile(tutorFile, fileOperation.searchLine(tutorFile, "67856"));
                    fileOperation.printFile(tutorFile);
                }
            } else {
                return;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("tutor.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n\n" + "****************************************" + "\n"
                + "2-Learn About Courses" + "\n");

        try {
            fileOperation.printFile(courseFile);
        } catch (FileNotFoundException ex) {
            System.out.println("tutor.txt not found" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\n\n" + "****************************************" + "\n"
                + "3-Assignment Operations" + "\n");
        System.out.println("****************************************" + "\n"
                + "a-Homework Assignments" + "\n");
        assignment = new Homework("", "");

        assignment.setCourseName(course);

        assignment.setDeadline("12/02/2016");

        assignment.setLateDeadline("15/02/2016");

        assignment.howManyStudent();

        System.out.println(assignment.toString());
        System.out.println("\n\n" + "****************************************" + "\n"
                + "b-Quiz Assignments" + "\n");
        assignment = new Quiz("", "");

        assignment.setCourseName(course);

        assignment.setDeadline("17/09/2016");

        assignment.setLateDeadline("10/12/2016");

        assignment.howManyStudent();
        System.out.println(assignment.toString());
        System.out.println("\n\n" + "****************************************" + "\n"
                + "c-Group Project Assignments" + "\n");
        assignment = new GroupProject("", "", 0);

        assignment.setCourseName(course);

        assignment.setDeadline("17/09/2016");

        assignment.setLateDeadline("10/12/2016");
        assignment.setManyPeople(7);
        assignment.howManyStudent();
        System.out.println(assignment.toString());

        // SENARIO 3
        System.out.println("\n\n" + "****************************************" + "\n"
                + "SENARIO 3: \n");
        Tutor tutor = new Tutor("465", "ufuk", "tutor@gmail.com");
        tutor.enrolOperations();

        // SENARIO 4
        System.out.println("\n\n" + "****************************************" + "\n"
                + "SENARIO 4: \n");
        Student student7 = new Student("567767", "hilal", "hilal@gmail.com");
        student7.enrolOperations();

    }

}
