package Arrays;

import java.util.Scanner;

public class ToFindSecMin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the Array Elements");

        for (int i = 0; i < a.length; i++) {

            a[i]=sc.nextInt();

        }
        int max=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]>max){
                max=a[i];
            }

        }
        int min=max;
        int secMin=0;
        for (int i = 0; i <a.length ; i++) {

            if (a[i]<min) {
                secMin = min;
                min = a[i];
            } else if (a[i]<secMin&&a[i]!=min) {
                secMin=a[i];

            }


        }
        System.out.println("Second Min Element is :"+secMin);

    }
}
