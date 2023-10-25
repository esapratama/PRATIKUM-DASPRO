import java.util.Scanner;

public class LinearSearch10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array : ");
        int banyak = sc.nextInt();
        int[] arrayInt = new int[banyak];
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i ++) {
            System.out.println("Masukkan jumlah elemen array ke-" + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key tidak ditemukan"6
    );
    }
}