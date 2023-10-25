import java.util.Scanner;

public class Pemilihan2Percobaan110 {
    public static void main(String[] args) throws Exception {
        Scanner scan10 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = scan10.nextInt();

       if ((tahun % 4) == 0 && (!(tahun % 100 == 0) || (tahun % 400 == 0))) {
                System.out.println("Tahun Kabisat");
       } else {
        System.out.println("Bukan Tahun Kabisat");
       }
    }
}
