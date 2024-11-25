package com.quest.exception_handling.organization;

import java.util.InputMismatchException;

public class Manager extends Employee{
    private  int teamSize;
    Manager(String name, int age, double salary , int teamSize) throws IllegalArgumentException, InvalidInputException {
        super(name, age, salary);
        setTeamSize(teamSize);
    }

    public void setTeamSize(int teamSize) throws IllegalArgumentException {
        if (teamSize < 0) {
            throw new InputMismatchException("Team size should be greater than 0");
        } else {
            this.teamSize = teamSize;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTeam size = "+teamSize;
    }
}
