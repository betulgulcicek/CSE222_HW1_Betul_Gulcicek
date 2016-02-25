package com.betulgulcicek;


/**
 *
 * @author Betul Gulcicek
 */
public class Students implements Users {

    private String userID;
    private String userName;
    private String email;
    /**
     * no parameter constructor
     */
    public Students() {
       userID = "";
        userName = "";
        email = "";
    }

     /**
     * constructor
     *
     * @param userID student id - string value
     * @param userName student name - string value
     * @param email student email - string value
     */
    public Students(String userID, String userName, String email) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
    }

    /**
     * constructor
     *
     * @param userID student id - string value
     * @param userName student name - string value
     * @param email student email - string value
     * @param learnCourse studentin aldigi dersler - Course object
     */
    public Students(String userID, String userName, String email, Course learnCourse) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
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
