package Number;

import java.util.Scanner;

public class MultiplicationTableInRange {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number");
        int start = scanner.nextInt();
        System.out.println("Enter the End");
        int end = scanner.nextInt();

        for (int i = start; i <=end ; i++) {
            System.out.println("=====================================");
            System.out.println("Table : "+i);
            System.out.println("=====================================");
            for (int j = 1; j <=10 ; j++) {
                int res=i*j;
                System.out.println(i+" * "+j+" = "+res);

            }
        }
        }
}
