package com.github.martinfrank.cleancode;

public class SquareEquationSolver {
    public SquareEquationSolution solve(double a, double b, double c) {
        SquareEquationSolution solution = new SquareEquationSolution();
        double[] zeroes = findZerosInSquareEquation(a,b,c);
        solution.setZeroes(zeroes);
        return solution;
    }

    private static double[] findZerosInSquareEquation(double a, double b, double c) {
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
