package Patterns.Number;

import java.util.Scanner;

public class Num12321 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            int num=1;
            for (int j = 1; j <=n*2-1; j++) {
                if (i+j>n&&j-i<n)
                {

                    System.out.print(num+" ");

                    if (j<n) {
                        num++;

                    }
                    else {
                        num--;
                    }
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
