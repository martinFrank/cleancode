package com.github.martinfrank.cleancode;

public class App {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -2;

        double[] result = findZerosInSquareEquation(a,b,c);
        System.out.println("the zeroes are at " + result[0] + " and at " +result[1]);
    }

    public static double[] findZerosInSquareEquation(double a, double b, double c) {
        double discriminant = Math.pow(b,2) - 4 * a * c;
        double n1 = 0;
        double n2 = 0;
        if (a > 0) {
            n1 = (-1*b + Math.sqrt(discriminant))/(2*a);
            n2 = (-1*b - Math.sqrt(discriminant))/(2*a);
        }
        if (a == 0) {
            n1 = (-1*b )/(2*a);
            n2 = n1;
        }
        if (a < 0) {
            n1 = Double.NaN;
            n2 = n1;
        }
        return new double[]{n1,n2};
    }
}
