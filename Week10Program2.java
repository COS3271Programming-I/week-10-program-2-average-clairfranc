package week10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week10Program2 {

    public static double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("=== Average Value Calculator ===");
        System.out.println("Enter between 1 and 30 integers separated by spaces:");
        System.out.print("→ ");

        String line = input.nextLine();

        String[] parts = line.trim().split("\\s+");

        for (int i = 0; i < parts.length && i < 30; i++) {
            try {
                numbers.add(Integer.parseInt(parts[i]));
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid entry: " + parts[i]);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No valid numbers entered. Exiting program.");
        } else {
            double avg = calculateAverage(numbers);
            System.out.printf("You entered %d numbers.%n", numbers.size());
            System.out.printf("The average value is: %.2f%n", avg);
        }

        input.close();
    }
}



