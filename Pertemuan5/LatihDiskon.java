/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Kamis, 26 Februari 2026
Program: Latihan 2, Pertemuan 5
*/

package Pertemuan5;

public class LatihDiskon {
    public static void main(String[] args) {
        double totalBelanja = 750000, diskon; //variabel totalBelanja untuk menampung total belanja, dan diskon untuk menampung diskon yang didapat
        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        if(totalBelanja<100000){//jika totalBelanja kurang dari Rp 100000
            diskon = totalBelanja * 0/100;
            System.out.println("Diskon (0%): Rp " + diskon);
            System.out.println("Harga Akhir: Rp " + (totalBelanja-diskon));
            System.out.println("Anda Hemat: Rp " + diskon);
        }
        else if(totalBelanja>=100000 && totalBelanja<=499999){//jika totalBelanja di rentang Rp 100000 - Rp 499999;
            diskon = totalBelanja * 5/100;
            System.out.println("Diskon (5%): Rp " + diskon);
            System.out.println("Harga Akhir: Rp " + (totalBelanja-diskon));
            System.out.println("Anda Hemat: Rp " + diskon);
        }
        else if(totalBelanja>=500000 && totalBelanja<=999999){//jika totalBelanja di rentang Rp 500000 - Rp 999999;
            diskon = totalBelanja * 10/100;
            System.out.println("Diskon (10%): Rp " + diskon);
            System.out.println("Harga Akhir: Rp " + (totalBelanja-diskon));
            System.out.println("Anda Hemat: Rp " + diskon);
        }
        else if(totalBelanja>=1000000){//jika totalBelanja melebihi Rp 1000000
            diskon = totalBelanja * 15/100;
            System.out.println("Diskon (15%): Rp " + diskon);
            System.out.println("Harga Akhir: Rp " + (totalBelanja-diskon));
            System.out.println("Anda Hemat: Rp " + diskon);
        }
    }
}
