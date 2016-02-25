package com.betulgulcicek;

/**
 *
 * @author Betul Gulcicek
 */
public class Homework extends Assignments {

    /**
     * constructor
     *
     * @param deadline assignment deadline - string value
     * @param lateDeadline assignment late deadline - string value
     */
    public Homework(String deadline, String lateDeadline) {
        super(deadline, lateDeadline);
    }

    @Override
    /**
     * how many student for homework assignment
     */
    public int howManyStudent() {
        return 1;
    }

    @Override
    /**
     * toString method for homework
     */
    public String toString() {
        return ("Course Name: " + getCourseName().getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }
}
