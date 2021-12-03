package com.jhonenv.Day2;

import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class PartOne {
    static int depth = 0;
    static int horizontalPosition = 0;

    public static void main(String[] args) {
        try (Scanner file = new Scanner(Paths.get("src/main/java/com/jhonenv/Day2/subInstructions.txt"))) {
            while (file.hasNextLine()) {
                String[] split = file.nextLine().split(" ");
                HandleCommand(split[0], Integer.valueOf(split[1]));
            }
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }

        System.out.printf("""
                            depth: %d,
                            horizontal position: %d
                            """, depth, horizontalPosition);

        System.out.println("multiplied: " + depth * horizontalPosition);
    }

    public static void HandleCommand(String command, int num) {
        switch (command) {
            case "forward" -> horizontalPosition += num;
            case "down"    -> depth += num;
            case "up"      -> depth -= num;
        }
    }
}
