package com.jhonenv.Day1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        int count = 0;

        try (Scanner file = new Scanner(Paths.get("src/main/java/com/jhonenv/Day1/depths.txt"))) {
            int prevousNumber = Integer.valueOf(file.nextLine());

            while (file.hasNextLine()) {
                int currentNumber = Integer.valueOf(file.nextLine());

                if (prevousNumber < currentNumber) {
                    count++;
                }
                prevousNumber = currentNumber;
            }
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }

        System.out.println(count);
    }
}
