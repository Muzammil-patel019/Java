package Number;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();//13

        while (true)
        {
            int sum=0;
            while (n>0)
            {
            int d=n%10;
            sum=sum+(d*d);
            n= n/10;
            }
            n=sum;
            {
                if (sum==1)
                {
                    System.out.println("Happy");
                    break;
                }
                else if (sum==4)
                {
                    System.out.println("Sad");
                    break;
                }

            }

        }
    }
}