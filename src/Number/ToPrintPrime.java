package Number;

import java.util.Scanner;

public class ToPrintPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        int end= sc.nextInt();

        for (int i = start; i <=end ; i++) {
            int count=0;int n=i;

            for (int j = 1; j <=n ; j++) {
                if (n%j== 0) {
                    count++;

                }

            } if (count == 2) {
                System.out.println(i);
            }


        }

    }

}
