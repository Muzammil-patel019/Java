package Strings;

import java.util.Scanner;

public class ReverseWithoutSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        String s1="";
        String res="";

        for (int i = 0; i <s.length() ; i++) {

            if (s.charAt(i)!=' '){
                s1=s1+s.charAt(i);

            }
            else {
                for (int j =s1.length()-1; j >=0 ; j--) {
                    res=res+s1.charAt(j);

                }
                res=res+" ";
                s1="";

            }

            }
        System.out.println(res);
        }
    }

