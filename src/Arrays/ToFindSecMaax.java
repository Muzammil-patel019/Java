package Arrays;

import java.util.Scanner;

public class ToFindSecMaax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the Array Elements");

        for (int i = 0; i < a.length; i++) {

            a[i]=sc.nextInt();

        }
        int min=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]<min){
                min=a[i];
            }

        }
        int max=min;
        int secMax=0;
        for (int i = 0; i <a.length ; i++) {

           if (a[i]>max) {
               secMax = max;
               max = a[i];
           } else if (a[i]>secMax&&a[i]!=max) {
               secMax=a[i];

           }


        }
        System.out.println("Second Max Element is :"+secMax);

    }
}
