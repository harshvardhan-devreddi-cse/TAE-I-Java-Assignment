import java.util.Scanner;

public class Q3_Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of three subjects:");

        System.out.print("Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        System.out.print("Result: ");

        if (average >= 75) {
            System.out.println("Grade A");
        } else if (average >= 60) {
            System.out.println("Grade B");
        } else if (average >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
