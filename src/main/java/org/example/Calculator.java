package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {

    public double CalculateRoomSize(ArrayList<ArrayList<Double>> dimensions) {
        double roomSize;
        ArrayList<Double> posDim = dimensions.get(0);
        ArrayList<Double> negDim = dimensions.get(1);
        double posTotal = this.SumArrayList(posDim);
        double negTotal = 0.0F;
        if (!negDim.isEmpty()) {
            negTotal = this.SumArrayList(negDim);
        }
        roomSize = posTotal - negTotal;
        return roomSize;
    }

    public double SumArrayList(ArrayList<Double> arrList) {
        double sum = 0.0F;
        for (double f : arrList) {
            sum += f;
        }
        return sum;
    }

    public double calculateTotalPaint(double roomSize, double paintCoverage, int coatsOfPaint) {
        return roomSize / paintCoverage * (double)coatsOfPaint;
    }
}
