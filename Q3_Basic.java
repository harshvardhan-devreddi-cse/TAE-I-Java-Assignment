import java.util.Scanner;

public class Q3_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of three subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3;

        if (avg >= 75)
            System.out.println("Grade A");
        else if (avg >= 60)
            System.out.println("Grade B");
        else if (avg >= 40)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

        sc.close();
    }
}
