package com.betulgulcicek;

/**
 *
 * @author Betul Gulcicek
 */
public interface Users {

    /*private String userID;
    private String userName;
    private String email;
*/
    /**
     * no parameter constructor
     */
   /* public Users() {
        userID = "";
        userName = "";
        email = "";
    }*/

    /**
     * constructor
     *
     * @param userID user id - string value
     * @param userName user name - string value
     * @param email user email - string value
     */
   /* public Users(String userID, String userName, String email) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
    }*/

    /**
     * getter method for user id
     *
     * @return the userID user id - string value
     */
    public String getUserID();

    /**
     * setter method for user id
     *
     * @param userID the userID to set user id - string value
     */
    public void setUserID(String userID);

    /**
     * getter method for user name
     *
     * @return the userName user name - string value
     */
    public String getUserName();

    /**
     * setter method for user name
     *
     * @param userName the userName to set user name - string value
     */
    public void setUserName(String userName);

    /**
     * getter method for user email
     *
     * @return the email user email - string value
     */
    public String getEmail();

    /**
     * setter method for user email
     *
     * @param email the email to set user email - string value
     */
    public void setEmail(String email) ;
    

    /**
     * metdhod to enrol course
     */
    public void enrolOperations() ;
      //  System.out.println(getUserName() + " Successful Enrol ");
   // }
}
