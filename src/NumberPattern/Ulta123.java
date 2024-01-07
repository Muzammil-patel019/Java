package NumberPattern;

import java.util.Scanner;

public class Ulta123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = n; i>=1; i--) {
            int sum=n;
            for (int j = 1; j <=n; j++){
                if (i<=j) {


                    System.out.print(sum-- + " ");
                }
                else {

                    System.out.print("  ");
                }




            }
            System.out.println();
        }
    }
}
