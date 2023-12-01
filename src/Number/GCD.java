package Number;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the M value");
        int m= sc.nextInt();
        System.out.println("Enter the N value");
        int n= sc.nextInt();
        int gcd=0;
        for (int i = 1; i <=m &&i<n ; i++) {
            if (m%i == 0 && n%i==0) {
                gcd=i;

            }

        }
        System.out.println(gcd);

    }
}
