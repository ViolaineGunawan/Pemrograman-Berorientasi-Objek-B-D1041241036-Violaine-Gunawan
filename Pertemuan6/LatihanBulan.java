/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 1, Pertemuan 6
*/

package Pertemuan6;

public class LatihanBulan {
    public static void main(String[] args) {
        int bulan = 5; //variabel bulan
        String namaBulan; //string namaBulan untuk menampung nama bulan
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + bulan);
        switch (bulan) {
            case 1:
                namaBulan = "Januari"; //jika bulan = 1 maka namaBulan adalah Januari
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Error"; //jika nama bulan tidak dalam rentang 1-12, maka error
                break;
        }
        if(namaBulan == "Error"){ //jika namaBulan = Error
            System.out.println("Error: Angka bulan tidak valid (1-12)");//cetak tidak valid
        }
        else{ //jika namaBulan != Error
            System.out.println("Nama Bulan: " + namaBulan);//cetak namaBulan
        }
    }
}
