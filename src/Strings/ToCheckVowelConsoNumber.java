package Strings;

import java.util.Locale;
import java.util.Scanner;

public class ToCheckVowelConsoNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine().toUpperCase();
        int v=0,c=0,sp=0,n=0;

        for (int i = 0; i <s.length() ; i++) {

            char ch=s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    v++;

                }
                else {
                    c++;
                }

            } else if (ch>='0'&&ch<='9') {
                n++;

            }
            else {
                sp++;
            }

        }
        System.out.println("Vowels       :"+v);
        System.out.println("Consonants   :"+c);
        System.out.println("Special Char :"+sp);
        System.out.println("Numbers      :"+n);


    }
}
