package Offer;

import java.util.Scanner;

public class NthEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int d=0;

        for (int i = 1; i <=n ; i++) {
            if(i%2==0){
                 d=n*2;
            }


        }
        System.out.println(d);
    }
}
