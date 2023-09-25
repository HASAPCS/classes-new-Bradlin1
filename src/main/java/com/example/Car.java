package com.example;

public class Car {
    private int speed;

    public Car() {
        // TODO: Initialize the speed to 0
        this.speed = 0;
    }

    public void speedUp(int increment) {
        // TODO: Increase the speed by the value of the increment parameter
        this.speed = this.speed + increment;
    }


    public void slowDown(int decrement) {
        // TODO: Decrease the speed by the value of the decrement parameter. 
        // The speed should not be negative.
        this.speed = this.speed - decrement;
    }

    public int currentSpeed() {
        // TODO: Return the current speed
        return this.speed;  // Change this default return statement
    }
}
