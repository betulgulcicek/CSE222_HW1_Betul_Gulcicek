package com.mycompany.bir;

import java.util.ArrayList;



/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:08
 */
public class Users {

    
    private String userID;
    private String userName;
    private String email;
    
    public Users(){
        userID = "";
        userName = "";
        email = "";
    }

    public Users(String userID, String userName, String email){
        this.userID = userID;
        this.userName = userName;
        this.email = email;
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
    
    public void enrolOperations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}