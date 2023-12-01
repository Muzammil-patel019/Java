package Number;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number perfect");
        int n = sc.nextInt();//13
        int count=0;


        for (int i = 1; i < n; i++) {


            if (n%i==0){

                count++;
            }

        }
        if (count==2) {


        }
    }
}
