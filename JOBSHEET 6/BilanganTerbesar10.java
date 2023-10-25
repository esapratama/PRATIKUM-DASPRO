import java.util.Scanner;

public class BilanganTerbesar10 {
    public static void main(String[] args) {
    Scanner sc10 = new Scanner(System.in);
    
    int bil1, bil2, bil3;

    System.out.println("Masukkan bilangan pertama: ");
    bil1 = sc10.nextInt();
    System.out.println("Masukkan bilangan ke 2");
    bil2  = sc10.nextInt();
    System.out.println("masukkan bilangan ke 3: ");
    bil3 = sc10.nextInt();

    if (bil1>bil2) {
        System.out.println("Bilangan terbesar adalah "+bil1);    
      }else   if (bil2<bil3) {
        System.out.println("Bilangan terbesar adalah "+ bil3);
    
    }else
    System.out.println("Bilangan terbesar adalah "+bil2);
}
}