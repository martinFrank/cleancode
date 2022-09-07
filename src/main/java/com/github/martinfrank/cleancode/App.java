package com.github.martinfrank.cleancode;

public class App {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -2;

        String result = findZerosInSquareEquation(a,b,c);
        System.out.println(result);
    }

    private static String findZerosInSquareEquation(double a, double b, double c) {
        double discriminant = Math.pow(a,2) - 4 * a * c;
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
        return "the zeroes are at " + n1 + " and at " +n2;
    }
}
