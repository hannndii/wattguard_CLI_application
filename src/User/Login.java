package User;

import java.util.HashMap;
import java.util.Scanner;

public class Login extends user {

    public Login(String user_name, String id_user, String pass, String email, String alamat_user) {
        super(user_name, id_user, pass, email, alamat_user);
    }

    public static boolean validasiLogin(HashMap<String, String> userMap, String inputUsername, String inputPassword) {
        return userMap.containsKey(inputUsername) && userMap.get(inputUsername).equals(inputPassword);
    }

    public static boolean prosesLogin(HashMap<String, String> userMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("       SELAMAT DATANG DI WATTGUARD       ");
        System.out.println("========================================");

        while (true) {
            try {
                System.out.print(" Masukkan username: ");
                String inputUsername = scanner.nextLine();
                if (inputUsername.isEmpty()) {
                    throw new IllegalArgumentException("Username tidak boleh kosong!");
                }

                System.out.print(" Masukkan password: ");
                String inputPassword = scanner.nextLine();
                if (inputPassword.isEmpty()) {
                    throw new IllegalArgumentException("Password tidak boleh kosong!");
                }

                if (validasiLogin(userMap, inputUsername, inputPassword)) {
                    System.out.println("========================================");
                    System.out.println("           Login Berhasil!");
                    System.out.println("========================================");
                    System.out.println("    Selamat datang, " + inputUsername + "!");
                    System.out.println("Kami senang melihat Anda kembali.");
                    System.out.println("========================================");
                    return true;
                } else {
                    System.out.println("========================================");
                    System.out.println("           Login Gagal!");
                    System.out.println("========================================");
                    System.out.println("Username atau password salah. Silakan coba lagi.");
                    System.out.println("========================================");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }

            System.out.print("Coba lagi? (y/n): ");
            String retry = scanner.nextLine();
            if (!retry.equalsIgnoreCase("y")) {
                return false;
            }
        }
    }
}

