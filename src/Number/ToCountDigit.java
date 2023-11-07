package Number;

import java.util.Scanner;

public class ToCountDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count=0;
        System.out.println("Enter the  number");
        int n= sc.nextInt();
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
