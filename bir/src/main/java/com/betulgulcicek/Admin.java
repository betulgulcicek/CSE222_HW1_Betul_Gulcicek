package com.betulgulcicek;

/**
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:07
 */
public class Admin extends Users {
    
    private Course course;

    public Admin() {
        super();
        this.course = course;
    }

    Admin(String id, String name, String email) {
        super(id, name, email);
        setCourse(course);
    }

    public void addTeacher(Teacher user) {
        getCourse().addTeacher(user, true);
    }
    
     public void removeTeacher(String id) {
        getCourse().removeTeacher(id);
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }
    
}
