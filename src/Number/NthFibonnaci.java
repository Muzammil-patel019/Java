package Number;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int t= sc.nextInt();

        int a=0,b=1,c=0;
        for (int i = 1; i <t ; i++) {
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(a);
    }
}
