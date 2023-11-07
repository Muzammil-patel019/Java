package Number;

import java.util.Scanner;

public class ToFindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial");
        int n = sc.nextInt();
        int fact=1;
//        while (n>0){
//            int d=n%10;
//
//        }
        for (int i = n; i >=1 ; i--) {

            fact=fact*i;
        }
        System.out.println(fact);
    }
}
