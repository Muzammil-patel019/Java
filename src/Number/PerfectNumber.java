package Number;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number perfect");
        int n = sc.nextInt();//14
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                sum+=i;
            }

        }
        if (sum==n){
            System.out.println("Perfect");
        }
        else {
            System.out.println("Not Perfect");
        }

    }
}
