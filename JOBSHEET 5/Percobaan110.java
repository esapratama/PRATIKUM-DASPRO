import java.util.Scanner;
public class Percobaan110 {
    public static void main(String[] args) {

    Scanner input00 = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = input00.nextInt();
    
    String result = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil";
    System.out.print(result);
    }
}