package lesser.fallingsand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sand sand = new Sand(50, 10);
        sand.randomSand(50);
        displaySand(sand);

        System.out.println("Press Enter to make sand fall...");
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextLine().isEmpty()) {
            sand.fall();
            displaySand(sand);
        }
    }

    private static void displaySand(Sand sand) {
        System.out.println(sand.toString());
    }
}