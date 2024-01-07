package Arrays;

import java.util.Scanner;

public class PrintEvenElementsInAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int ar[]=new int [size];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= sc.nextInt();

        }
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]%2==0){
                System.out.print(ar[i]+" ");
            }

        }


    }
}
