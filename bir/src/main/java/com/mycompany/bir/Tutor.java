package com.mycompany.bir;

/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:08
 */
public class Tutor extends Students{


    public Tutor() {
        super();
    }

    public Tutor(String userID, String userName, String email) {
        super(userID, userName, email);
    }
    
    public Tutor(String userID, String userName, String email, Course giveCourse, Course getCourse) {
        super(userID, userName, email, getCourse);
    }

}
