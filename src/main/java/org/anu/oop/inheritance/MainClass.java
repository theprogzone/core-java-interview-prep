package org.anu.oop.inheritance;

public class MainClass {

    /**
     * In this class all the calculateSum methods are examples for the method overloading.
     * Method overloading is the compile time polymorphism.
     */

    public int val = 10;

    public void print() {
        System.out.println("This is main class");
    }

    public int calculateSum(int i, int j) {
        return i + j;
    }

    public double calculateSum(double i, double j) {
        return i + j;
    }

    public double calculateSum(double i, double j, double k) {
        return i + j + k;
    }

    public double multiply(double i, double j) {
        return i * j;
    }
}
