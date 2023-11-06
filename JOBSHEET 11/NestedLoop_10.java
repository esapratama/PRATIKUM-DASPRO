import java.util.Scanner;
public class NestedLoop_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double[][] arrayEsa = new double[2][3];
        for (int i = 0; i < arrayEsa.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < arrayEsa[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arrayEsa[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < arrayEsa.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < arrayEsa[0].length; j++) {
                System.out.print(arrayEsa[i][j] + " ");
            }
            System.out.println();
        }
    }

}
