package org.anu.oop.inheritance;

public class SubClass extends MainClass {

    public int subVal = 20;

    @Override
    public void print() {
        System.out.println("Value from main class: " + super.val);
        System.out.println("Value from sub class: " + this.subVal);
        System.out.println("This is sub class");
    }

    // Overriding calculateSum method from the Main class.
    // Similar name for method overriding is run time polymorphism.
    @Override
    public double calculateSum(double i, double j, double k) {
        return i + j + k;
    }

    // This is giving error
    /*public int calculateSum(double i, double j, double k) {
        return (int) (i + j + k);
    }*/

    // Overloading calculateSum method
    public double calculateSum(double i, double j, double k, double l) {
        return i + j + k + l;
    }

    // This multiply method is not overriding MainClass multiply method
    public double multiply(double i, double j, double k) {
        return i * j * k;
    }
}
