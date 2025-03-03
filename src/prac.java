import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            // Read the input values
            String s1 = sc.next();
            int x = sc.nextInt();

            // Print the formatted output dynamically

            System.out.printf("%-15s%03d\n", s1 , x);


        }

        System.out.println("================================");
        sc.close();
    }
}
