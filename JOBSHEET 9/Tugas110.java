import java.util.Arrays;
import java.util.Scanner;

public class Tugas110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }

        Arrays.sort(nilai);

        int ntertinggi = nilai[jmlElemen - 1];
        int nterendah = nilai[0];
        double total = 0;

        for (int i = 0; i < jmlElemen; i++) {
            total += nilai[i];
        }

        double rataRata = total / jmlElemen;

        System.out.println("Nilai tertinggi: " + ntertinggi);
        System.out.println("Nilai terendah: " + nterendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}