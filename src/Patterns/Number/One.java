package Patterns.Number;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int j = 1; j <= n; j++) {

                if (i<j)
                {
                    System.out.print(i + " ");

                } else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
