package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public UserInput(Scanner sc) {
    }

    public ArrayList<ArrayList<Float>> GetRoomSize(Scanner sc) {
        ArrayList<ArrayList<Float>> dimensions = new ArrayList<ArrayList<Float>>();
        ArrayList<Float> negativeDimensions = new ArrayList<Float>();
        ArrayList<Float> positiveDimensions = new ArrayList<Float>();
        System.out.println("\nWould you like to account for items blocking the walls? If so, type \"yes\", otherwise type \"no\".");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            negativeDimensions = this.GetFloatInput(sc);
        }

        dimensions.add(positiveDimensions);
        System.out.println("Positive dimensions: " + String.valueOf(positiveDimensions));
        dimensions.add(negativeDimensions);
        System.out.println("Negative dimensions: " + String.valueOf(negativeDimensions));
        return dimensions;
    }

    public ArrayList<Float> GetFloatInput(Scanner sc) {
        ArrayList<Float> arrList = new ArrayList<Float>();
        System.out.println("\nEnter dimensions of all objects in m^2 (Metres squared) as a decimal" +
                " or whole number, one at a time.\ne.g. A wall 3m by 3.5m as 10.5.\n When done, type \"done\"");
        while(true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                return arrList;
            }
            float inputAsFloat = Float.parseFloat(input);
            arrList.add(inputAsFloat);
        }
    }

    public Float GetPaintCoverage(Scanner sc) {
        System.out.println("\nPlease enter the coverage of your paint in m^2 (Metres squared) per Litre" +
                " as a decimal or whole number.\ne.g. 6m^2 as 6.0 or 6.");
        String input = sc.nextLine();
        return Float.parseFloat(input);
    }

    public int GetCoatsOfPaint(Scanner sc) {
        System.out.println("\nGenerally, at least 2 coats of paint are recommended.\nPlease enter the" +
                " number of coats of paint you wish to apply as a whole number.\ne.g. 2");
        String input = sc.nextLine();
        return Integer.parseInt(input);
    }
}
