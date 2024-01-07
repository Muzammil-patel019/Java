package Character_Pattern;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch='A';
        for (int i = 1; i <= n; i++) {

           int b=ch;
           char ch1=ch;

            for (int j = 1; j <= n; j++) {
                if (i>=j) {
                    System.out.print(ch1+" ");
                    b=b+n-j;
                    ch1= (char) b;


                }

                else {
                    System.out.print("  ");
                }

            }
            ch++;

            System.out.println();


        }
    }
}
