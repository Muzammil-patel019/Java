package Arrays;

import java.util.Scanner;

public class OddIndexValueInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the Array Elements");

        for (int i = 0; i <ar.length ; i++) {
            ar[i]= sc.nextInt();

        }

        for (int i = 0; i <ar.length ; i++) {
          if (i%2!=0){
              System.out.println(ar[i]);
          }

        }

    }

}
