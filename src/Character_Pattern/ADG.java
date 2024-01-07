package Character_Pattern;

import java.util.Scanner;

public class ADG {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();

            char ch='A';
            for (int i = 1; i <= n; i++) {
                int assci = ch;
                char ch1=ch;
                
                for (int j = 1; j <= n; j++) {

                    System.out.print(ch1+" ");
                    assci+=n;
                    ch1=(char)assci;

                }
                System.out.println();
               ch++;

            }
        }
}
