package Character_Pattern;

import java.util.Scanner;

public class HallowAAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch='A';
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (i==1||j==n||j==1||i==n){
                System.out.print(ch+" ");
            }
            else
            {
                System.out.print("  ");
            }

            }
            ch++;
            System.out.println();


        }


    }
}
