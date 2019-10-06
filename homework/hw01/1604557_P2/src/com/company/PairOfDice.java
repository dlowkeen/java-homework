package com.company;


public class PairOfDice {
    private Dice diceOne;
    private Dice diceTwo;

    public PairOfDice() {
        this.diceOne = new Dice();
        this.diceTwo = new Dice();
    }

    public int roll() {
        System.out.println("Rolling the dice right now!");
        return diceOne.roll() + diceTwo.roll();
    }

    public int currentValue() {
        System.out.println("Current Value is " + (diceOne.currentSide + diceTwo.currentSide));
        return diceOne.currentSide + diceTwo.currentSide;
    }

    public String toString() {
        System.out.println("Dice1: " + diceOne.currentSide + ", Dice2: " +  diceTwo.currentSide + " = " + (diceOne.currentSide + diceTwo.currentSide));
        return "Dice1: " + diceOne.currentSide + "+ Dice2: " +  diceTwo.currentSide + " = " + (diceOne.currentSide + diceTwo.currentSide);
    }
}