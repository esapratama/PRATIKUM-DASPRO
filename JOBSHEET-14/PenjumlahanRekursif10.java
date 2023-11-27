import java.util.Scanner;

public class PenjumlahanRekursif10 {
    // Fungsi rekursif untuk menghitung penjumlahan
    public static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        // Menghitung penjumlahan rekursif
        int hasil = penjumlahanRekursif(f);

        System.out.println("Penjumlahan rekursif dari 1 sampai " + f + " adalah: " + hasil);
    }
}
