package NumberPattern;

public class EvenOddNumber {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {

            for (int j = 1; j <=4 ; j++) {
                if (i%2==0){
                    System.out.print(j+" ");
                }
                else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
