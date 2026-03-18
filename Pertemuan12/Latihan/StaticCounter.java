/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 18 Maret 2026
Program: Latihan 1: Static Counter pertemuan 12
*/

package Pertemuan12.Latihan;

class Mahasiswa{
    static int jumlahMahasiswa = 0; //static
    String nama; //non static
    public Mahasiswa(String nama){ //constructor
        this.nama = nama;
        System.out.println("Mahasiswa dibuat: " + this.nama);
        jumlahMahasiswa++; //otomatis menambah jumlahMahasiswa
    }
    static int getJumlah() { //mengembalikan jumlahMahasiswa
        return jumlahMahasiswa;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi");
        Mahasiswa mahasiswa3 = new Mahasiswa("Citra");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}