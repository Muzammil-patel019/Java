package Strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String res="";

        String []s1=s.split(" ");
        for (int i = 0; i <s1.length ; i++) {
            String s2=s1[i];
            for (int j =s2.length()-1; j >=0 ; j--) {
                res=res+s2.charAt(j);

            }
            res=res+" ";

        }
        System.out.println(res);
    }
}
