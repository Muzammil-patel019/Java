package Arrays;

import java.util.Scanner;

public class MergingOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[]a={1,2,3,4};
        int b[]={5,6,7,8};
        int c[]=new int[a.length+b.length];
        int temp=0,temp1=0;
        for (int i = 0; i < c.length; i++)
        {
            if (temp<a.length) {
                c[i] =a[temp++];
            }
            else {
                c[i]=b[temp1++];

            }
        }
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]+" ");

        }
//
    }
}
