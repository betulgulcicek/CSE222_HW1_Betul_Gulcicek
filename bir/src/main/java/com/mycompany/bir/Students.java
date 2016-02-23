package com.mycompany.bir;

import java.util.ArrayList;



/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:08
 */
public class Students extends Users{
	
        private Course course;

	public Students(){
            super();
            course = new Course();
	}
        public Students(String userID, String userName, String email)
       {
          super(userID, userName, email);
       }
        
       public Students(String userID, String userName, String email, Course learnCourse)
       {
           super(userID, userName, email);
       }


}