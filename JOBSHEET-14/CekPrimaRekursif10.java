import java.util.Scanner;

public class CekPrimaRekursif10 {
     // Fungsi rekursif untuk mengecek apakah suatu bilangan prima atau bukan
     public static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        // Memanggil fungsi rekursif untuk mengecek bilangan prima
        boolean hasil = cekPrimaRekursif(n, n - 1);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}