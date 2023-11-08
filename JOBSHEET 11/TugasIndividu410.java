import java.util.Scanner;

public class TugasIndividu410 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = sc10.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
