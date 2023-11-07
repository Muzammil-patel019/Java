package Number;

public class SwapTwoVariableUsing3rd {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int temp;
        System.out.println("===========================");
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);

        temp=b;
        b=a;
        a=temp;
        System.out.println("===========================");
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
