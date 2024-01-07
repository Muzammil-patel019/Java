package Character_Pattern;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch='C';
        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n; j++) {
                if (i<=j) {
                    System.out.print(ch+" ");

                }

                else {
                    System.out.print("  ");
                }






            }
            ch--;



            System.out.println();


        }
    }
}
