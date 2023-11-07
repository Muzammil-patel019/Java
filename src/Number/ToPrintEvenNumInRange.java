package Number;

import java.util.Scanner;

public class ToPrintEvenNumInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Starting range");
        int start= sc.nextInt();

        System.out.println("End");
        int end = sc.nextInt();

        for (int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
