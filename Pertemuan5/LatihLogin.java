/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Kamis, 26 Februari 2026
Program: Latihan 2, Pertemuan 5
*/

package Pertemuan5;

public class LatihLogin {
    public static void main(String[] args) {
    String username="admin", password="adminsdfs123"; //variabel untuk menampung username dan password
    System.out.println("=== VALIDASI LOGIN ===");
    System.out.println("Username: " + username);
    System.out.println("Password: ****");
    System.out.println("---");
    if (username.equals("admin")) {//jika username benar
        System.out.println("Username valid");
        if (password.equals("admin123")) {//jika password benar
            System.out.println("Password benar");
            System.out.println("LOGIN BERHASIL!");
            System.out.println("Selamat datang, " + username);
        } else {//jika password salah
            System.out.println("Password salah");
            System.out.println("LOGIN GAGAL!");
        } 
    } else { //jika username salah
        System.out.println("Username tidak valid");
        System.out.println("LOGIN GAGAL!");
    }
    }   
}
