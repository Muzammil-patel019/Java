package NumberPattern;

public class HallowSquar {
    public static void main(String[] args) {
        int num=1;
        int n=3;
        for (int i = 1; i <=3; i++) {

            for (int j = 1; j <=3 ; j++) {
                if (i==1||j==1||j==n||i==n){
                    System.out.print(num+++" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
