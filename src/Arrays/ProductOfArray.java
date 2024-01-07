package Arrays;

import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter thArray Elements");

        for (int i = 0; i <ar.length ; i++) {
            ar[i]= sc.nextInt();

        }
        int prod=1;
        for (int i = 0; i <ar.length ; i++) {
            prod=prod*ar[i];

        }
        System.out.println(prod);
    }
}
