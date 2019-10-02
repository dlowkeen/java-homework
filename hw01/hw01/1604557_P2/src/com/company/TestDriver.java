package com.company;
import javax.swing.text.Position;
import java.lang.Math;

public class TestDriver {
//    Create a class called PairOfDice in Java. Objects of this class represent a single pair of six-sided dice. The only attributes of such an
//    object are the face values of the pair of dice. Provide a constructor.
//    Provide a roll method that simulates rolling the dice (you need to use
//            a random number generator). Provide a value method that returns
//    the sum of the current face values of the dice. Provide a toString
//    method that returns a nicely formatted string representing the pair
//    of dice, for example “5 : 3 = 8”. Finally, create a “test driver” class
//    containing the main method that demonstrates that your PairOfDice
//    class performs correctly.

    public static void main(String[] args) {
        PairOfDice pairOfDice = new PairOfDice();
        pairOfDice.roll();
        pairOfDice.currentValue();
        pairOfDice.toString();

        System.out.println("STARTING BAD DICE EXAMPLE");
        BiasedDice badDice = new BiasedDice();
        for (var i = 0; i < 10; i++)
            badDice.biasedEvenRoll();
    }
}
