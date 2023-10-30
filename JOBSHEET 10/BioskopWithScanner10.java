import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc10 = new Scanner(System.in);
        int baris, kolom, menu = 0, lagi;
        String nama, next;

        String[][] penonton = new String[4][2];
        while (menu != 3) {
            System.out.println("============================");
            System.out.println("Pilih menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan nomor menu : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama : ");
                        nama = sc10.nextLine();
                        System.out.print("Masukkan baris : ");
                        baris = sc10.nextInt();
                        System.out.print("Masukkan kolom : ");
                        kolom = sc10.nextInt();

                        if (baris <= 4 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;

                                System.out.print("Input penonton lainnya? (y/n) : ");
                                next = sc10.nextLine();

                                if (next.equalsIgnoreCase("n")) {
                                    break;
                                }
                            } else {
                                System.out.println("Kursi telah terisi");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton :");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out
                                .println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
                    }
                    break;
                default:
                    break;
            }
        }
        
    }
    
}