import java.util.Scanner;

public class Latihan210 {
    public static void main(String[] args) {
        String username = "nnasea", input_username, password = "140604", input_password;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan username : ");
        input_username = input.nextLine();
        System.out.println("Masukkan password : ");
        input_password = input.nextLine();

        if (input_username.equals(username) && input_password.equals(password)){
            System.out.println("Anda berhasil login");
        }else{
            System.out.println("Anda gagal login");
        }

    }
}
