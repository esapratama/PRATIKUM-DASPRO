import java.util.Scanner;
public class NestedLoop_10 {
    public static void main(String[] args) {
        Scanner scan10 = new Scanner(System.in);
        double[][] arrayEsa = new double[5][7];
        for (int i = 0; i < arrayEsa.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < arrayEsa[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                arrayEsa[i][j] = scan10.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < arrayEsa.length; i++) {
            System.out.println("Kota ke-" + i);
            double totalTemp = 0;
            for (double temp : arrayEsa[i]) {
                totalTemp += temp;
                System.out.println(temp);
            }
            double rerataarrayEsa = totalTemp / arrayEsa[i].length;
            System.out.println("\nRata-rata: " + rerataarrayEsa +"\n");
        }
        scan10.close();
    }

}
