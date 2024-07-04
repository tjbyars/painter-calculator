package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {

    public float CalculateRoomSize(ArrayList<ArrayList<Float>> dimensions) {
        float roomSize;
        ArrayList<Float> posDim = dimensions.get(0);
        ArrayList<Float> negDim = dimensions.get(1);
        float posTotal = this.SumArrayList(posDim);
        float negTotal = 0.0F;
        if (!negDim.isEmpty()) {
            negTotal = this.SumArrayList(negDim);
        }
        roomSize = posTotal - negTotal;
        return roomSize;
    }

    public float SumArrayList(ArrayList<Float> arrList) {
        float sum = 0.0F;
        for (float f : arrList) {
            sum += f;
        }
        return sum;
    }

    public float calculateTotalPaint(float roomSize, float paintCoverage, int coatsOfPaint) {
        return roomSize / paintCoverage * (float)coatsOfPaint;
    }
}
