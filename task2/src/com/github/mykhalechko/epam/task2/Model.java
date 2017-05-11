package com.github.mykhalechko.epam.task2;


import java.util.ArrayList;
import java.util.List;

public class Model {

    private int number;
    private List<Integer> userNumbers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }
}
