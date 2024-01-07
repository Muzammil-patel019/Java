package Strings;

import java.util.Scanner;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string to convert");
        String s= sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {

            char ch=s.charAt(i);
            int a=s.charAt(i);
            if (a>=65&&a<=91){
                ch= (char) (a+32);
                System.out.print(ch+" ");
            }
            else {
                System.out.print(ch+" ");
            }
        }
    }
}
