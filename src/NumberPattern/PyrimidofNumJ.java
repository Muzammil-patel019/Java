package NumberPattern;

import java.util.Scanner;

public class PyrimidofNumJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int j = 1; j <= 2*n-1; j++) {

                if (i+j>n&&j-i<n)
                {
                    System.out.print(num+++ " ");

                } else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
