
package com.betulgulcicek;
/**
 * 
 * @author  Betul Gulcicek
 */

public abstract class Assignments {

    private Course course;

    private String deadline;
    private String lateDeadline;
    private int manyPeople;

    /**
     * Assignments constructor
     * @param deadline deadline for course
     * @param lateDeadline late deadline for course 
     */
    public Assignments(String deadline, String lateDeadline) {
        this.deadline = deadline;
        this.lateDeadline = lateDeadline;
    }

    /**
     * getter method for course deadline
     * @return the deadline course's deadline - string value
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * setter method for course deadline
     * @param deadline the deadline to set
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * getter method for course late deadline
     * @return the lateDeadline course's late deadline - string value
     */
    public String getLateDeadline() {
        return lateDeadline;
    }

    /**
     * setter method for course late deadline
     * @param lateDeadline the lateDeadline to set - string value
     */
    public void setLateDeadline(String lateDeadline) {
        this.lateDeadline = lateDeadline;
    }

    /**
     * method returns the course object
     * @return the course course object
     */
    public Course getCourseName() {
        return course;
    }

    /**
     * setter method for course object
     * @param course the course to set
     */
    public void setCourseName(Course course) {
        this.course = course;
    }

    /**
     * return to How many people project
     * @return 1 constant value
     */
    public int howManyStudent() {
        return 1;
    }



    @Override
    /**
     * methods that provide information about the course
     */
    public String toString() {
        return ("Course ID: " + course.getCourseID() + ", Course Name: " + course.getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }

    /**
     * setter method for how many people project
     * @param manyPeople How many people project - integer value
     */
    void setManyPeople(int manyPeople) {
        this.manyPeople = manyPeople;
    }

    /**
     * getter  method for how many people project
     * @return the manyPeople How many people project - integer value
     */
    public int getManyPeople() {
        return manyPeople;
    }
}
