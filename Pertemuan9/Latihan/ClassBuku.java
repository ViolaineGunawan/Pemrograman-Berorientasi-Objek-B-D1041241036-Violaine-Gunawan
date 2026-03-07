/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 7 Maret 2026
Program: Latihan class buku pertemuan 9
*/

package Pertemuan9.Latihan;
class Buku{
    String judul; //atribut dari class Buku
    String pengarang;
    int harga;

    public void tampilkanInfo(){ //method dari class Buku
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul        : " + judul);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Harga        : Rp " + harga);
    }
}

public class ClassBuku {
    public static void main(String[] args) {
    Buku buku1 = new Buku(); //Object 1
    buku1.judul="Pemrograman Java";
    buku1.pengarang="Budi Raharjo";
    buku1.harga=125000;
    buku1.tampilkanInfo();

    System.out.println();

    Buku buku2 = new Buku();  //Object 2
    buku2.judul="Algoritma dan Struktur Data";
    buku2.pengarang="Rinaldi Munir";
    buku2.harga=150000;
    buku2.tampilkanInfo();
    }      
}
