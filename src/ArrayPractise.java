import java.util.Scanner;

public class ArrayPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int a[]=new int [size];
        for (int i = 0; i <a.length ; i++) {
            a[i]= sc.nextInt();

        }
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0){
                System.out.println(a[i]);
            }

        }


    }
}
