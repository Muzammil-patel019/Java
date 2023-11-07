package Number;

import java.util.Scanner;

public class ToFindSpyNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check the spy number");
        int n= sc.nextInt();

        int prod=1;
        int sum=0;
        while(n>0){

            int d=n%10;
            sum=sum+d;
            prod=prod*d;
            n/=10;
        }
        if (sum==prod){
            System.out.println("The number is Spy");

        }
        else {
            System.out.println("It's not a spy number");
        }
    }
}
