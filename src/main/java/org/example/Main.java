package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInput userInput = new UserInput(sc);
        Calculator calculator = new Calculator();
        float totalPaintNeeded = calculator.calculateTotalPaint(
                calculator.CalculateRoomSize(userInput.GetRoomSize(sc)),
                userInput.GetPaintCoverage(sc),
                userInput.GetCoatsOfPaint(sc));
        System.out.println("In total you will need: " + totalPaintNeeded + " litres of paint.");

    }
}

/*
TO DO
Error handling on invalid inputs
Different measurements (eg gallons)
Price calculation
 */