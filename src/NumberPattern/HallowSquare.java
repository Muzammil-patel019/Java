package NumberPattern;

public class HallowSquare {
    public static void main(String[] args) {
        int num=1;
        for (int i = 1; i <=3; i++) {

            for (int j = 1; j <=3 ; j++) {
            if (i==2||j==2){
                System.out.print(" ");




            }
            else {
                System.out.print(num++);



            }

        }
            System.out.println();
    }
    }
}
