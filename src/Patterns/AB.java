package Patterns;

public class AB {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n1; j++) {
                if ((j == 1 && i > 1) || (j == n1 && i > 1) || (i == 4 && j <= n1) || (i == 1 && j > 1 && j < 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j=1;j<=n1;j++){
                if((j==1&&i<=n) || (i==1&&j<n1) || (i==n&&j<n1) || (i==4&&j<n1) || (j==n1&&(i==2||i==3||i==n1||i==6))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            for(int j=1;j<=n1;j++){
                if((j==1&&i>1&&i<n) || (i==n&&j>1) || (i==1&&j>1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}