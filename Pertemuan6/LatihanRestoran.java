/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 3, Pertemuan 6
*/

package Pertemuan6;

public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 5, quantity = 4, hargaSatuan;
        System.out.println("=== MENU RESTORAN ==="); 
        System.out.println("Kode Menu: " +  menuCode); 
        System.out.println("Jumlah: " + quantity); 
        System.out.println();
        System.out.println("Pesanan Anda:");

        switch (menuCode) {
            case 1: //jika menuCode=1 maka cetak Nasi Goreng, beserta harganya
                System.out.println("Nama Menu: Nasi Goreng"); 
                hargaSatuan = 15000; 
                break;
            case 2:
                System.out.println("Nama Menu: Mie Ayam"); 
                hargaSatuan = 12000; 
                break;
            case 3:
                System.out.println("Nama Menu: Bakso"); 
                hargaSatuan = 10000; 
                break;
            case 4:
                System.out.println("Nama Menu: Soto Ayam"); 
                hargaSatuan = 13000; 
                break;
            case 5:
                System.out.println("Nama Menu: Es Teh"); 
                hargaSatuan = 3000; 
                break;
            default:
                System.out.println("Pilihan Invalid");
                hargaSatuan = 0;
                break;
        }
        int totalHarga = hargaSatuan * quantity; //totalHarga menampung hasil kali hargaSatuan dan quantity
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah :" + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + totalHarga);
    }
}
