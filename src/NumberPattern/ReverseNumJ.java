package NumberPattern;

import java.util.Scanner;

public class ReverseNumJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = n; j>=1; j--) {
                if (i >= j) {

                    System.out.print(j + " ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
    }
}
