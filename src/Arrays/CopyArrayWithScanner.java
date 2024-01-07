package Arrays;

import java.util.Scanner;

public class CopyArrayWithScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter series of no");
        int size = sc.nextInt();
        int[]a=new int [size];
        int b[]=new int[size] ;
        for (int i = 0; i < a.length; i++)
        {
            a[i]= sc.nextInt();

        }
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i];
            System.out.print(b[i]);
        }
//        for (int i =0 ; i<a.length ; i++) {
//            System.out.print(b[i]);
//
//
//        }
    }
}
