package org.logic;

import java.util.Random;

public class MathOperation {

    public static int getRandomNumber(int smallestInRange, int longestInRange){
        return (int) ((Math.random() * (longestInRange - smallestInRange)) + smallestInRange);
    }
}
