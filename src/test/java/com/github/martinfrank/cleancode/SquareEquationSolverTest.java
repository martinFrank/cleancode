package com.github.martinfrank.cleancode;

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
        SquareEquationSolution solution = squareEquationSolver.solve(a, b, c);

        //then
        Assert.assertTrue(solution.getZeroes().isEmpty()); //no regular solutions
    }

    @Test
    public void EquationSolverOneSolutionsTest() {
        //given
        double a = 1;
        double b = 0;
        double c = 0;
        double precision = 0.0001;

        //when
        SquareEquationSolver squareEquationSolver = new SquareEquationSolver();
        SquareEquationSolution solution = squareEquationSolver.solve(a, b, c);
        System.out.println(solution);

        //then
        Assert.assertEquals(1, solution.getZeroes().size()); //no regular solutions
        double zero = solution.getZeroes().stream().findAny().orElseThrow(RuntimeException::new);
        Assert.assertEquals(0d, zero, precision); //double zeroes at 0
    }
}
