import java.util.Scanner;
public interface Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        
        Scanner scan10 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan Sudut1 : ");
        sudut1 = scan10.nextFloat();
        System.out.print("Masukkan Sudut2 : ");
        sudut2 = scan10.nextFloat();
        System.out.print("Masukkan Sudut3 : ");
        sudut3 = scan10.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {

            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if ((sudut1 == sudut2 && sudut1 == sudut3 && sudut2 ==sudut3)) {
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if ((sudut 1 == sudut2 && sudut1 == sudut3 && sudut2 ==sudut3)) {
            System.out.println("Segitiga tersebut adalah bukan segita siku-siku");
        }
        } else {
            System.out.println("Bukan Segitiga");
    }
}
}