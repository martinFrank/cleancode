package com.github.martinfrank.cleancode;

import java.util.HashSet;
import java.util.Set;

public class SquareEquationSolution {

    private double[] zeroes;
    public void setZeroes(double[] zeroes) {
        this.zeroes = zeroes;
    }

    public Set<Double> getZeroes(){
        Set<Double> result = new HashSet<>();
        if (zeroes != null && zeroes.length == 2){
            if (!Double.isNaN(zeroes[0])){
                result.add(zeroes[0]);
            }
            if (!Double.isNaN(zeroes[1])){
                result.add(zeroes[1]);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "the zeroes are at " + getZeroes();
    }
}
