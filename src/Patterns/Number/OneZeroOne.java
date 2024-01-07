package Patterns.Number;

import java.util.Scanner;

public class OneZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i >= j&&i%2==0)
                {
                    System.out.print("0 ");

                }

                else if(i<j)
                {
                    System.out.print("  ");
                }
                else {
                    System.out.print("1 ");
                }

            }
            System.out.println();

        }
    }
}
