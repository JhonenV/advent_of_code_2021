package com.jhonenv.Day1;

import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class PartTwo {
    public static void main(String[] args) {
        int count = 0;

        try (Scanner file = new Scanner(Paths.get("src/main/java/com/jhonenv/Day1/depths.txt"))) {
            int firstNumber = Integer.valueOf(file.nextLine());
            int secondNumber = Integer.valueOf(file.nextLine());
            int previousSum = Integer.MAX_VALUE;

            while (file.hasNextLine()) {
                int currentNumber = Integer.valueOf(file.nextLine());
                int currentSum = firstNumber + secondNumber + currentNumber;

                if (currentSum > previousSum) {
                    count++;
                }

                firstNumber = secondNumber;
                secondNumber = currentNumber;
                previousSum = currentSum;
            }
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }

        System.out.println(count);
    }
}
