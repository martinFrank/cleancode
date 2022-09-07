package com.github.martinfrank.cleancode;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SquareEquationSolverTest
{
    @Test
    public void equationSolverTest()
    {
        //given
        double a = 1;
        double b = 0;
        double c = -1;

        //when
        SquareEquationSolver squareEquationSolver = new SquareEquationSolver();
        SquareEquationSolution solution = squareEquationSolver.solve(a,b,c);

        //then
        Assert.assertTrue(solution.getZeroes().contains(1d)); //first expected zeroes at x=1
        Assert.assertTrue(solution.getZeroes().contains(-1d)); //second expected zeroes at x=-1
    }

    @Test
    public void EquationSolverNoSolutionsTest()
    {
        //given
        double a = -1;
        double b = 0;
        double c = -1;

        //when
        SquareEquationSolver squareEquationSolver = new SquareEquationSolver();
        SquareEquationSolution solution = squareEquationSolver.solve(a,b,c);
        System.out.println(solution);

        //then
        Assert.assertTrue(solution.getZeroes().isEmpty()); //no regular solutions
    }
}
