package com.company;

public class Dice {
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private int sideFour;
    private int sideFive;
    private int sideSix;
    public int currentSide;

    public Dice() {
        this.sideOne = 1;
        this.sideTwo = 2;
        this.sideThree = 3;
        this.sideFour = 4;
        this.sideFive = 5;
        this.sideSix = 6;
    }

    public int roll() {
        int value = (int)(Math.random() * this.sideSix) + this.sideOne;
        this.currentSide = value;
        return value;
    }
}