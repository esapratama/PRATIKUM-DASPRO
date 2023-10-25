import java.util.Scanner;
public class Hitung10 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        
        int SKS, jumlahMATKUL;
        double ip;
        String Nama, Matakuliah, Nilai;

        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input24.nextLine();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int n = input24.nextInt();

        
        double total_bobot = 0;
        int total_sks = 0;
        int remidi = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nMata kuliah ke.." + i);
            input24.nextLine();
            System.out.print("Masukkan nama MATKUL : ");
            String MATKUL = input24.nextLine();
            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E) : ");
            String nilai = input24.nextLine();
            System.out.print("Masukkan jumlah SKS : ");
            int Sks = input24.nextInt();

            double bobot;
            switch (nilai) {
                case "A":
                    bobot = 4.0;
                    break;
                case "B+":
                    bobot = 3.5;
                    break;
                case "B":
                    bobot = 3.0;
                    break;
                case "C+":
                    bobot = 2.5;
                    break;
                case "C":
                    bobot = 2.0;
                    break;
                case "D":
                    bobot = 1.0;
                    remidi++;
                    break;
                default:
                    bobot = 0.0;
                    remidi++;
            }

            total_bobot += Sks * bobot;
            total_sks += Sks;
        }

        double IP = total_bobot / total_sks;

        System.out.println("\n nama mahasiswa: " + nama);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", IP);
        System.out.println("Total mata kuliah: " + n);
        System.out.println("Total SKS: " + total_sks);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + remidi);
    }
}