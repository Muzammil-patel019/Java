package Patterns.Number;

import java.util.Scanner;

public class Ni123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = 1; i <=n*2-1 ; i++) {
            int num=1;

            for (int j = 1; j <=n; j++) {
                if (i+j>=n+1&&i-j<=n-1)
                {

                    System.out.print(num+++" ");

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
