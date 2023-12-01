package Number;

import java.util.Scanner;

public class ToPrintPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        int end= sc.nextInt();
        int sum=0;

        for (int i = start; i <=end ; i++) {
            int count=0;

            for (int j = 1; j <=i ; j++) {
                if (i%j== 0) {
                    count++;

                }

            } if (count == 2) {
                sum=sum+i;

            }


        }
        System.out.println(sum);

    }

}
