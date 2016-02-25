package com.betulgulcicek;

/**
 *
 * @author Betul Gulcicek
 */

public class GroupProject extends Assignments {

    private int manyPeople;

    /**
     * constructor
     *
     * @param deadline assignment deadline - string value
     * @param lateDeadline assignment late deadline - string value
     * @param manyPeople how many people assignment - integer value
     */
    public GroupProject(String deadline, String lateDeadline, int manyPeople) {
        super(deadline, lateDeadline);
        manyPeople = 0;
    }

    @Override
    /**
     * how many student for group project assignment
     */
    public int howManyStudent() {
        return getManyPeople();
    }

    /**
     * getter method for how many people  group project assignment
     *
     * @return the manyPeople how many student
     */
    public int getManyPeople() {
        return manyPeople;
    }

    /**
     * setter method for how many people  group project  assignment
     *
     * @param manyPeople the manyPeople to set - integer value
     */
    public void setManyPeople(int manyPeople) {
        this.manyPeople = manyPeople;
    }

    @Override
    /**
     * toString method for group projects
     */
    public String toString() {
        return ("Course Name: " + getCourseName().getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }

}
