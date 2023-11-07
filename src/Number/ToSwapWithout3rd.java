package Number;

public class ToSwapWithout3rd {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;

        System.out.println("===========================");
        System.out.println("Before Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b=a+b;
        a=b-a;
        b =b-a;
        System.out.println("===========================");
        System.out.println("After Swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
