import java.util.Scanner;

public class HargaBayar10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, jumlah, halBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan Merk buku yang dibeli ");
        merkBuku=input.nextLine();
        input.nextLine();
        System.out.println("Masukkan Jumlah Halaman buku yang dibeli ");
        halBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah Barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Diskon yang didapatkan");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}
