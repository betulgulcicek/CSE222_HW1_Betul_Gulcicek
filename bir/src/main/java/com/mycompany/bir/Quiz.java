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
public class Quiz extends Assignments {

    public Quiz(String deadline, String lateDeadline) {
        super(deadline, lateDeadline);
    }

    @Override
    public int howManyStudent() {
        return 1;
    }

    @Override
    public String toString() {
        return ("Course Name: " + getCourseName()
                + ", Deadline: " + getDeadline() + ", Late Deadline: " + getLateDeadline()
                + ", Many People: " + howManyStudent());
    }
}
