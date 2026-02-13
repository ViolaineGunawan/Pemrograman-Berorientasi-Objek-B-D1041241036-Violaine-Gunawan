/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Jumat, 13 Februari 2026
Program: Latihan 1, Pertemuan 4
*/
package Pertemuan4.Latihan_Pertemuan4;

public class LatihanProduk {
    public static final double NILAI_PAJAK = 0.11; //menggunakan CONSTANT_CASE
    public static void main(String[] args) {
        String namaProduk = "Laptop Asus"; //camelCase
        int hargaSatuan = 7000000, jumlahStok = 15; //camelCase
        boolean isAvailable = true; //prefix is
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah Stok: " +  jumlahStok);
        System.out.println("Status Tersedia: " + isAvailable);
        System.out.println("---");
        int totalNilaiStok = hargaSatuan * jumlahStok; //camelCase
        System.out.println("Total Nilai Stok: Rp " + totalNilaiStok);
        int pajak = (int) (totalNilaiStok * NILAI_PAJAK); //Narrowing (Explicit Casting)
        System.out.println("Pajak (11%): Rp " + pajak);
    }
}
