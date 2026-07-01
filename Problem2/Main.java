import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of marks: ");
        int count = scanner.nextInt();
        int[] marks = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double average = calculateAverage(marks);
        System.out.println(average);
        scanner.close();
    }

    private static double calculateAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
