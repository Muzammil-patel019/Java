package Strings;

import java.util.Scanner;

public class SwappingLastWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();



        String[] ch = s.split(" ");
        String temp  = ch[0];
        ch[0]=ch[ch.length-1];
        ch[ch.length-1]=temp;

//        String s1=String.join(" ",ch);
//        System.out.println(s1);

        for (int i = 0; i < ch.length ; i++) {
            System.out.print(ch[i]+" ");

        }



       



        

    }
}
