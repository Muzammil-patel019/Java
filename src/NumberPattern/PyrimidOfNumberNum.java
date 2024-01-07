package NumberPattern;

import java.util.Scanner;

public class PyrimidOfNumberNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num=1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n*2-1; j++) {

                if (i+j>n&&j-i<n)
                {
                    System.out.print(num++ + " ");

                } else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
