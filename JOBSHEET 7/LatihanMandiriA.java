import java.util.Scanner;

public class LatihanMandiriA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaMahasiswa;
        int jumlahMahasiswa = 30;
        char jenisKelamin;

        int i = 0;

        for (i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P) Mahasiswa: ");
            jenisKelamin = scanner.nextLine().charAt(0);

            if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                System.out.println("Merupakan Mahasiswa Perempuan " + namaMahasiswa);
            }
        }
    }
 }