package Number;

import java.util.Scanner;

public class ToCheckBuzzNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int rem =n%10;


        if(n%7==0 || rem==7){
            System.out.println("Buzz");

        }
        else {
            System.out.println("Not Buzz");
        }
    }
}
