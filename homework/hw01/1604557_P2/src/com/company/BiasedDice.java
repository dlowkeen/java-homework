package com.company;
//Now imagine that we also want to include an unfair or biased dice
//in our solution. This means that rolling the dice doesn’t have equal
//probabilities for each possible value (in a fair dice each value has the
//equal probability of 1/6 to be rolled). You don’t need to implement the method of rolling an unbiased roll. The question is
//how would you reorganize your program to include this BiasedDicePair class? Add that new class to your project and leave the rolling
//method empty if you don’t want to implement it.

// NOTE: I chose to implement the bias on the roll. But you could have changed the values of the sides of the dice, to
// reflect whatever bias you would want, i.e. all of the sides are even.

public class BiasedDice {
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private int sideFour;
    private int sideFive;
    private int sideSix;
    public int currentSide;

    public BiasedDice() {
        this.sideOne = 1;
        this.sideTwo = 2;
        this.sideThree = 3;
        this.sideFour = 4;
        this.sideFive = 5;
        this.sideSix = 6;
    }

    public int biasedEvenRoll() {
        int value = (int)((Math.random() * this.sideThree) + this.sideOne) * 2;
        this.currentSide = value;
        System.out.println(this.currentSide);
        return value;
    }
}
