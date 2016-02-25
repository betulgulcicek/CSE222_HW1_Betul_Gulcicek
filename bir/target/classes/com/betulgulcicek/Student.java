package com.betulgulcicek;

/**
 *
 * @author Betul Gulcicek
 */
public class Student extends Students {

    /**
     * no parameter constructor
     */
    public Student() {
        super();
    }

    /**
     * constructor
     *
     * @param userID student id - string value
     * @param userName student name - string value
     * @param email student email - string value
     */
    public Student(String userID, String userName, String email) {
        super(userID, userName, email);
    }

    /**
     * constructor
     *
     * @param userID student id - string value
     * @param userName student name - string value
     * @param email student email - string value
     * @param getCourse studentin aldigi dersler - Course object
     */
    public Student(String userID, String userName, String email, Course getCourse) {
        super(userID, userName, email, getCourse);
    }

}
