package Number;

import java.util.Scanner;

public class ToFindPower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the N value");
        int n= sc.nextInt();
        System.out.println("Enter the M value");
        int m= sc.nextInt();
        int pow=1;
        for (int i = 1; i <=m ; i++) {
            pow=pow*n;


        }
        System.out.println(pow);
    }
}

