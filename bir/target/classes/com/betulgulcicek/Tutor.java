package com.betulgulcicek;

/**
 *
 * @author Betul Gulcicek
 */
public class Tutor extends Students {

    /**
     * no parameter constructor
     */
    public Tutor() {
        super();
    }

    /**
     * constructor
     *
     * @param userID tutor id - string value
     * @param userName tutor name - string value
     * @param email tutor email - string value
     */
    public Tutor(String userID, String userName, String email) {
        super(userID, userName, email);
    }

    /**
     * constructor
     *
     * @param userID tutor id - string value
     * @param userName tutor name - string value
     * @param email tutor email - string value
     * @param giveCourse tutorun verdigi dersler - string value
     * @param getCourse tutorun aldigi dersler - string value
     */
    public Tutor(String userID, String userName, String email, Course giveCourse, Course getCourse) {
        super(userID, userName, email, getCourse);
    }

}
