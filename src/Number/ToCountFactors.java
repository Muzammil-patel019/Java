package Number;

import java.util.Scanner;

public class ToCountFactors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int count=0;
        for (int i =1;i<=n;i++){
            if(n%i==0){
                count++;
            }

        }
        System.out.println("The factors of "+n+" are "+count);
    }
}
