package Number;

import java.util.Scanner;

public class ToFindNeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int sum=0;;
        int sq=n*n;
        while (sq>0){
           int d =sq%10;
            sum =sum+d;
            sq=sq/10;
        }
        if (sum == n) {
            System.out.println("Neon");

        }
        else {
            System.out.println("Not Neon");
        }
    }
}
