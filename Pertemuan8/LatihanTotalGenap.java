/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 3, Pertemuan 8
*/
package Pertemuan8;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        int total=0; //deklarasi variabel untuk menampung total dan inisialisasi 0
        for(int angka=1;angka<21;angka++){
            if(angka%2!=0){
                continue; //jika ganjil, maka continue atau lewati
            }
            total+=angka; //jika tidak terlewati artinya angka adalah genap, sehingga total += angka
            System.out.println("Tambah: " + angka + " -> Total: " + total);
        }
        System.out.println("---");
        System.out.println("Total Akhir: " + total); //cetak total akhir
    }
}
