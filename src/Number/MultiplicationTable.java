package Number;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        System.out.println("=====================================");
        for (int i = 1; i <=10 ; i++) {
            int res=n*i;
            System.out.println(n+" * "+i+" = "+res);

        }
        System.out.println("=====================================");

    }

}
