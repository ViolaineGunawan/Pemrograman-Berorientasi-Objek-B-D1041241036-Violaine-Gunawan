/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 13 Februari 2026
Program: Latihan 1 Pertemuan 3
*/
package Pertemuan3.Latihan1dan2_pertemuan3;

public class LatihDataMahasiswa { //nama public class harus sama dengan nama file .java
    public static void main(String[] args) {
        long nim = 2301010001L; //buat variabel yang dapat menampung angka nim, menggunakan long karena int tidak cukup
        String nama = "Budi Santoso"; //buat variabel string untuk menampung nama
        char kelas = 'A'; //buat variabel char untuk menampung sebuah huruf kelas
        boolean status = true; //buat variabel boolean untuk menampung status yakni true
        float ipk = 3.75f; //buat variabel untuk menampung desimal ipk, cukup menggunakan float
        int sks = 72; //buat variabel untuk menampung angka 72, cukup menggunakan int
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM           :" + nim); //tampilkan nim
        System.out.println("Nama          :" + nama); //tampilkan nama
        System.out.println("Kelas         :" + kelas); //tampilkan kelas
        System.out.println("Status Aktif  :" + status); //tampilkan status
        System.out.println("IPK Semester  :" + ipk); //tampilkan IPK
        System.out.println("Total SKS     :" + sks); //tampilkan sks
    }
}
