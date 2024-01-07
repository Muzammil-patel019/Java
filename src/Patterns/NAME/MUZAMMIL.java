package Patterns.NAME;

public class MUZAMMIL {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 5;
        for (int i = 1; i <= n; i++) {


            for (int j = 0; j < 9; j++) {
                if (j==1||j==7||(i==j&&i<=4&&j<=4)||(i+j==8&&i<4)){
                    System.out.print("M ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.print(" ");


            for (int j = 0; j < n; j++) {
                if ((j==1&&i<7)||(j==5&&i<7)||(i==7&&j>1&&j<5) ){
                    System.out.print("U ");
                }
                else {
                    System.out.print("  ");
                }


            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if ((i==1)||i==7||i+j==7 ){
                    System.out.print("Z ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.print("  ");



            for (int j = 1; j <= n1; j++) {
                if ((j == 1 && i > 1) || (j == n1 && i > 1) || (i == 4 && j <= n1) || (i == 1 && j > 1 && j < 5)) {
                    System.out.print("A ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < 9; j++) {
                if (j==1||j==7||(i==j&&i<=4&&j<=4)||(i+j==8&&i<4)){
                    System.out.print("M ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.print(" ");
            for (int j = 0; j < 9; j++) {
                if (j==1||j==7||(i==j&&i<=4&&j<=4)||(i+j==8&&i<4)){
                    System.out.print("M ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i==1||i==n||j==3){
                    System.out.print("I ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.print("  ");
            System.out.print(" ");


            for (int j = 1; j < n; j++) {
                if (j==1||i==7){
                    System.out.print("L ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.print(" ");



            System.out.println();

        }
    }
}

