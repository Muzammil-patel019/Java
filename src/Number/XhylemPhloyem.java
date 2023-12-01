package Number;

import java.util.Scanner;

public class XhylemPhloyem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();//1234
        int last=n%10;
        int is=0;

        n=n/10;

        while (n>9){
                int r=n%10;
                is=is+r;
                n=n/10;
            }
        int os=n+last;

            if (is==os){
                System.out.println("Xylem");
            }
            else {
                System.out.println("Phloem");
            }



    }
}
