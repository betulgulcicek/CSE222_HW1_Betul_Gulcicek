package com.betulgulcicek;
/**
 * 
 * @author Betul Gulcicek
 */

public class Admin implements Users {
    
    private Course course;
    private String userID;
    private String userName;
    private String email;

    /**
     * Admin no parameter constructor
     */
    public Admin() {
        userID = "";
        userName = "";
        email = "";
        this.course = course;
    }

    /**
     * Admin constructor
     * @param id admin's id - string value
     * @param name admin's name - string value
     * @param email admin's email - string value
     */
    Admin(String id, String name, String email) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        setCourse(course);
    }

    /**
     * Add teacher by admin
     * @param user teacher object
     */
    public void addTeacher(Teacher user) {
        getCourse().addTeacher(user, true);
    }
    /**
     * Remove teacher by admin
     * @param id teacher id - string value
     */
     public void removeTeacher(String id) {
        getCourse().removeTeacher(id);
    }

    /**
     * getter method for Course object
     * @return the course Course object
     */
    public Course getCourse() {
        return course;
    }

    /**
     * setter method for Course object
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
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

    @Override
    public void enrolOperations() {
        System.out.println(getUserName() + " Successful Enrol ");
    }
    
}
