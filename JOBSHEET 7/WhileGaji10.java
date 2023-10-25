import java.util .Scanner;

public class WhileGaji10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // deklarasi scanner dengan nama scan
        
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;
        gajiLembur=0;
        totalGajiLembur=0;
    
        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        
        while (i < jumlahKaryawan){
            System.out.println("Pilih jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ") ;
            jabatan = scan.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")){
                gajiLembur= jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                 gajiLembur= jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Tidak Valid");
                i--;
            }

        }
        totalGajiLembur += gajiLembur;
        System.out.println("Total gaji lembur: "+ totalGajiLembur);


}
}