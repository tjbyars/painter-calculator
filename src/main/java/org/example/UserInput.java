package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public UserInput(Scanner sc) {
    }

    public ArrayList<ArrayList<Double>> GetRoomSize(Scanner sc) {
        ArrayList<ArrayList<Double>> dimensions = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> negativeDimensions = new ArrayList<Double>();
        ArrayList<Double> positiveDimensions = new ArrayList<Double>();
        positiveDimensions = GetDoubleInput(sc);
        System.out.println("\nWould you like to account for items blocking the walls? If so, type \"yes\", otherwise type \"no\".");
        String input = GetInput(sc, "String");
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            negativeDimensions = GetDoubleInput(sc);
        }

        dimensions.add(positiveDimensions);
        System.out.println("Positive dimensions: " + String.valueOf(positiveDimensions));
        dimensions.add(negativeDimensions);
        System.out.println("Negative dimensions: " + String.valueOf(negativeDimensions));
        return dimensions;
    }

    public ArrayList<Double> GetDoubleInput(Scanner sc) {
        ArrayList<Double> arrList = new ArrayList<Double>();
        System.out.println("\nEnter dimensions of all objects in m^2 (Metres squared) as a decimal" +
                " or whole number, one at a time.\ne.g. A wall 3m by 3.5m as 10.5.\n When done, type \"done\"");
        while(true) {
            String input = GetInput(sc, "double", "done");
            if (input.equalsIgnoreCase("done")) {
                return arrList;
            }
            double inputAsDouble = Double.parseDouble(input);
            arrList.add(inputAsDouble);
        }
    }

    public Double GetPaintCoverage(Scanner sc) {
        System.out.println("\nPlease enter the coverage of your paint in m^2 (Metres squared) per Litre" +
                " as a decimal or whole number.\ne.g. 6m^2 as 6.0 or 6.");
        String input = GetInput(sc, "double");
        return Double.parseDouble(input);
    }

    public int GetCoatsOfPaint(Scanner sc) {
        System.out.println("\nGenerally, at least 2 coats of paint are recommended.\nPlease enter the" +
                " number of coats of paint you wish to apply as a whole number.\ne.g. 2");
        String input = GetInput(sc, "int");
        return Integer.parseInt(input);
    }

    // Do this and then just do Double.parseFloat() etc.
    public String GetInput(Scanner sc, String typeCheck) {
        String output = "";
        while (true) {
            switch (typeCheck) {
                case "String":
                    try {
                        output = sc.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a string");
                        sc.nextLine();
                        output = GetInput(sc, "String");
                    }
                case "double":
                    try {
                        double input = sc.nextDouble();
                        output = String.valueOf(input);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a decimal number");
                        sc.nextLine();
                        String input = GetInput(sc, "double");
                        output = String.valueOf(input);
                    }
                case "int":
                    try {
                        int input = sc.nextInt();
                        output = String.valueOf(input);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a whole number");
                        sc.nextLine();
                        String input = GetInput(sc, "int");
                        output = String.valueOf(input);
                    }
            }
        return output;
        }
    }

    // Leaving it with the typeCheck etc. for potential future proofing
    public String GetInput(Scanner sc, String typeCheck, String exception) {
        String output = "";
        while (true) {
            switch (typeCheck) {
                case "double":
                    try {
                        double input = sc.nextDouble();
                        output = String.valueOf(input);
                        break;
                    } catch (InputMismatchException e) {
                        String doneInput = sc.nextLine();
                        if (doneInput.equalsIgnoreCase("done")) {
                            output = doneInput;
                        } else {
                            System.out.println("Invalid input, please enter a decimal number");
                            sc.nextLine();
                            String input = GetInput(sc, "double");
                            output = String.valueOf(input);
                        }
                    }
            }
        return output;
        }
    }
}
