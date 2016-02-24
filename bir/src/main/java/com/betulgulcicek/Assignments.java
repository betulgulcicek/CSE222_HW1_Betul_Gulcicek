/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betulgulcicek;

/**
 *
 * @author GULCICEK
 */
public abstract class Assignments {

    private Course course;

    private String deadline;
    private String lateDeadline;
    private int manyPeople;

    
    public Assignments(String deadline, String lateDeadline) {
        this.deadline = deadline;
        this.lateDeadline = lateDeadline;
    }

    /**
     * @return the deadline
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the lateDeadline
     */
    public String getLateDeadline() {
        return lateDeadline;
    }

    /**
     * @param lateDeadline the lateDeadline to set
     */
    public void setLateDeadline(String lateDeadline) {
        this.lateDeadline = lateDeadline;
    }

    /**
     * @return the course
     */
    public Course getCourseName() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourseName(Course course) {
        this.course = course;
    }

    public int howManyStudent() {
        return 1;
    }



    @Override
    public String toString() {
        return ("Course ID: " + course.getCourseID() + ", Course Name: " + course.getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }

    void setManyPeople(int manyPeople) {
        this.manyPeople = manyPeople;
    }

    /**
     * @return the manyPeople
     */
    public int getManyPeople() {
        return manyPeople;
    }
}
