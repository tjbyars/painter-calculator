package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInput userInput = new UserInput(sc);
        Calculator calculator = new Calculator();
        double totalPaintNeeded = calculator.calculateTotalPaint(           // Run calculations
                calculator.CalculateRoomSize(userInput.GetRoomSize(sc)),    // Get wall sizes and calculate total
                userInput.GetPaintCoverage(sc),                             // Get paint info
                userInput.GetCoatsOfPaint(sc));
        totalPaintNeeded = Math.round(totalPaintNeeded * 1000d) / 1000d;    // Round to 3dp
        System.out.println("In total you will need at least: " + totalPaintNeeded + " litres of paint.");

    }
}