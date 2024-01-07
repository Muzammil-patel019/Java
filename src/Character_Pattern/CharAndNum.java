package Character_Pattern;

import java.util.Scanner;

public class CharAndNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            int num=1;
            for (int j = 1; j <= n; j++) {

                if (i%2==0) {
                    System.out.print(num++ + " ");
                }
                else {
                    System.out.print(ch+++" ");
                }




            }
            System.out.println();


        }
    }
}
