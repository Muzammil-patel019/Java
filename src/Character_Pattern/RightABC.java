package Character_Pattern;

import java.util.Scanner;

public class RightABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {

                if (i+j>=n+1) {
                    System.out.print(ch++ + " ");
                }
                else {
                    System.out.print("  ");
                }




            }
            System.out.println();


        }
    }
}
