package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();

        int temp=0,temp1=s.length()-1;
        boolean flag=false;
        while (temp<temp1){
            if (s.charAt(temp)==s.charAt(temp1)){
                flag=true;
                temp++;
                temp1--;


            }
            else {
                flag=false;
                break;

            }
        }
        if (flag==true){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("Not Plaindrome");
        }

    }
}
