package com.betulgulcicek;



/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:08
 */
public class Student extends Students {

        
        public Student(){
            super();
	}
        
        public Student(String userID, String userName, String email)
       {
          super(userID, userName, email);
       }
        
       public Student(String userID, String userName, String email, Course getCourse)
       {
          super(userID, userName, email, getCourse);
       }

}