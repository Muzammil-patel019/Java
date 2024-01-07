package Character_Pattern;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch='A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n*2-1; j++) {
                if (i+j>=n+1&&j-i<=n-1)
                {
                    System.out.print(ch+" ");
                    ch++;


                }

                else {
                    System.out.print("  ");
                }





            }


            System.out.println();


        }
    }
}
