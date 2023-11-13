import java.util.Scanner;

public class TugasIndividu410 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.print("Menghitung hasil perkalian: ");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {  
                int hasil = i * j;
                System.out.println(i + " x " + j + " = " + hasil + " \t ");
            }
            System.out.println();
        }
    }
}
