package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindEleUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter the array elements");

        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();

        }
        Arrays.sort(a);
        System.out.println("Enter the elemnt to find");
        int key= sc.nextInt();
        int l=0;
        int h=a.length;
        while (l<=h){
            int mid=l+h/2;

            if(key==a[mid]){
                System.out.println("Key is found");
                break;
            } else if (key>a[mid]) {
                l=mid+1;

            }
            else if(key<a[mid]){
                h=mid-1;
            }

        }

    }
}
