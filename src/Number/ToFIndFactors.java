package Number;

import java.util.Scanner;

public class ToFIndFactors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check the factors");
        int n= sc.nextInt();
        int sum=0;

        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
