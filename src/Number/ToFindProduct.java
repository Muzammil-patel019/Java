package Number;

import java.util.Scanner;

public class ToFindProduct {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();

        int prod=1;

        while(n>0){
            int d=n%10;
            prod=d*prod;
            n/=10;




        }
        System.out.println(prod);
    }
}
