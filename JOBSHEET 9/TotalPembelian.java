package ProjectSemester;

import java.util.Scanner;

public class totalPembelian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Cafe The Orange!");
        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = scanner.nextInt();

        int[] hargaItem = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Masukkan harga item ke-" + (i + 1) + " : ");
            hargaItem[i] = scanner.nextInt();

            System.out.print("Masukkan jumlah item ke-" + (i + 1) + " yang dibeli: ");
            jumlahBeli[i] = scanner.nextInt();
        }

        double totalPembelian = 0;
        for (int i = 0; i < jumlahItem; i++) {
            totalPembelian += hargaItem[i] * jumlahBeli[i];
        }

        System.out.print("\nTotal Pembelian Anda: Rp" + totalPembelian);
    }
}