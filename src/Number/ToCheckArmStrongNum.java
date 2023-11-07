package Number;

import java.util.Scanner;

public class ToCheckArmStrongNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong");
        int n= sc.nextInt();
        int count=0;
        int sum=0;
        int temp=n;
        while (n>0)
        {
             n=n/10;
             count++;
        }
        n=temp;
        while (n>0)
        {
            int d =n%10;
            int pow=1;

            for (int i = 1; i <=count ; i++)
            {
                pow=pow*d;
            }

            sum=sum+pow;
            n/=10;

        }
        if (sum==temp){
            System.out.println("Armstrong Num");
        }
        else {
            System.out.println("Not");
        }
    }
}
