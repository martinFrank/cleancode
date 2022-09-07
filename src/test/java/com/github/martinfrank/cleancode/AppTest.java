package com.github.martinfrank.cleancode;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void appTest()
    {
        //given
        double a = 1;
        double b = 0;
        double c = -1;
        double precision = 0.0001;

        //when
        double [] result = App.findZerosInSquareEquation(a,b,c);

        //then
        Assert.assertEquals(1, result[0], precision); //first expected zeroes at x=1
        Assert.assertEquals(-1, result[1], precision); //second expected zeroes at x=-1
    }
}
