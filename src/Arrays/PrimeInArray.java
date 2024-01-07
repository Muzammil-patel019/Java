package Arrays;

import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter thArray Elements");

        for (int i = 0; i <ar.length ; i++) {
            ar[i]= sc.nextInt();

        }
        int count=0;
        int j=1;
        for (int i = 0; i <ar.length ; i++) {

            j++;
           if(ar[i]%j==0)
           {
               count++;
           }
           if (count==2)
           {
               System.out.println(ar[i]);
           }

        }

    }
}
