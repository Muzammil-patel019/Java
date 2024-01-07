package Arrays;

import java.util.Scanner;

public class MerginngArrayInZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = new int[a.length + b.length];
        int temp = 0, temp1 = 0;
        int i = 0;
        while (i < c.length) {
            if (temp < a.length) {
                c[i] = a[temp++];
                i++;
            }
            if (temp1 < b.length) {
                c[i] = b[temp1++];
                i++;



            }
        }
            for (int j = 0; j <c.length ; j++) {
                System.out.print(c[j]+" ");

            }





    }

}
