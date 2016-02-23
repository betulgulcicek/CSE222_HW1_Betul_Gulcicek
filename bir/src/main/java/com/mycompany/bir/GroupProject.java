/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bir;

/**
 *
 * @author GULCICEK
 */
public class GroupProject extends Assignments {

    private int manyPeople;

    public GroupProject(String deadline, String lateDeadline, int manyPeople) {
        super(deadline, lateDeadline);
        manyPeople = 0;
    }

    @Override
    public int howManyStudent() {
        return getManyPeople();
    }

    /**
     * @return the howManyPeople
     */
    public int getManyPeople() {
        return manyPeople;
    }

    /**
     * @param manyPeople the manyPeople to set
     */
    public void setManyPeople(int manyPeople) {
        this.manyPeople = manyPeople;
    }


    @Override
    public String toString() {
        return ("Course Name: " + getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }

}
