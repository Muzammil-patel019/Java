package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheckAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s= sc.nextLine().toLowerCase();
        System.out.println("Enter String 2");
        String s1=sc.nextLine().toLowerCase();
        boolean flag=false;

        if (s.length()!=s1.length()){
            System.out.println("Not an Anagram");
        }
        else {
            char ch[]=s.toCharArray();
            char ch1[]=s1.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            for (int i = 0; i <ch.length ; i++) {
                if (ch[i]==ch1[i]){
                    flag=true;


                }
                else {
                    flag=false;
                    break;
                }

            }
        }
        if (flag==true){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }

    }


}
