package Patterns;

import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if ( i==j||j-i==n-1||i==1&&j<=n||i==n&&j>=n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}


