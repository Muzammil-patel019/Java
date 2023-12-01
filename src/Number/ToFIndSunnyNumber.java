package Number;

import java.util.Scanner;

public class ToFIndSunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int n1=n+1;

        boolean flag=false;

        for (int i =1 ; i <n1 ; i++) {
            if (i*i == n1) {
                flag=true;
                System.out.println("Sunny");
                break;

            }


        }
        if (flag==false){
            System.out.println("Not Sunny");
        }

    }
}
