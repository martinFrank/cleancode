package com.github.martinfrank.cleancode;

public class App {
    public static void main(String[] args) {
        double a = 0.25;
        double b = 0;
        double c = -1;

        SquareEquationSolver squareEquationSolver = new SquareEquationSolver();
        SquareEquationSolution solution = squareEquationSolver.solve(a,b,c);
        System.out.println(solution);
    }


}
