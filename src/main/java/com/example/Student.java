package com.example;

public class Student {
    private int score;

    public Student(int score) {
        // TODO: Initialize the score
        this.score = score;
    }

    public String grade() {
        // TODO: Calculate and return the grade based on the score. 
        // Use the following grading scale:
        // 90-100: "A"
        // 80-89: "B"
        // 70-79: "C"
        // 60-69: "D"
        // Below 60: "F"
        return "B";  // Change this default return statement
    }

    public boolean isPassing() {
        // TODO: Return true if the score is 60 or above, otherwise return false
        return true;  // Change this default return statement
    }
}
