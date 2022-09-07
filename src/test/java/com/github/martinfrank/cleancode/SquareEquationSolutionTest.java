package com.github.martinfrank.cleancode;

import org.junit.Assert;
import org.junit.Test;

public class SquareEquationSolutionTest {

    @Test
    public void testTwoZeroes(){
        //given
        double[] zeroes = {1,-1};
        SquareEquationSolution solution = new SquareEquationSolution();

        //when
        solution.setZeroes(zeroes);

        //then
        Assert.assertEquals(2, solution.getZeroes().size());
    }

    @Test
    public void testDoubleZeroes(){
        //given
        double[] zeroes = {0,0};
        SquareEquationSolution solution = new SquareEquationSolution();

        //when
        solution.setZeroes(zeroes);

        //then
        Assert.assertEquals(1, solution.getZeroes().size());
    }

    @Test
    public void testNaN(){
        //given
        double[] zeroes = {Double.NaN};
        SquareEquationSolution solution = new SquareEquationSolution();

        //when
        solution.setZeroes(zeroes);

        //then
        Assert.assertTrue(solution.getZeroes().isEmpty());
    }
}
