/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamscoreapp;

import java.util.Scanner;

/**
 *
 * @author 2533063
 */
public class Utilities {
    public static int getUserChoice(String prompt){
        int ch=0;
        Scanner k = new Scanner(System.in);
        System.out.print(prompt);
        ch=k.nextInt();
        return ch;
    }
    public static int getMin(int[] numbers){
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
        if (numbers[i] < lowest)
        lowest = numbers[i];
        }
        return lowest;
    }
    public static int getMax(int[] numbers){
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
        if (numbers[i] > highest)
        highest = numbers[i];
        }
        return highest;
    }
    public static double getAvg(int[] scores){
        double total = 0; // Initialize accumulator
        double average; // Will hold the average
        for (int i = 0; i < scores.length; i++)
            total += scores[i];
        average = total / scores.length;
        return average;
    }
}
