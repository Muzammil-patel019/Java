package NumberPattern;

import java.util.Scanner;

public class Continuous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            int sum=i;
            for (int j = 1; j <= n; j++){


                System.out.print(sum+ " ");
                sum=sum+3;



            }
            System.out.println();
        }
    }
}
