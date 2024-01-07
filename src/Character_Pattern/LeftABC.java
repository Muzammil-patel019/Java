package Character_Pattern;

import java.util.Scanner;

public class LeftABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch+" ");
                ch++;



            }
            System.out.println();


        }
    }
}
