package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter thArray Elements");

        for (int i = 0; i <ar.length ; i++) {
            ar[i]= sc.nextInt();

        }
        int sum=0;
        for (int i = 0; i <ar.length ; i++) {
           sum=sum+ar[i];

        }
        System.out.println(sum);
    }
}
