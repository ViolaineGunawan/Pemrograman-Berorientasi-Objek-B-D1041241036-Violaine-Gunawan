/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 2, Pertemuan 6
*/
package Pertemuan6;

public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 8, monthDays; //month untuk menampung angka bulan, monthDays untuk menampung total hari bulan
        String monthName; //monthName untuk menampung nama bulan
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        System.out.println("Angka Bulan: " + month);

        switch (month) {
            case 1:
                monthName = "Januari";//jika month=1 maka monthName adalah Januari
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3:
                monthName = "Maret";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mei";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "Agustus";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = "Error"; //jika month tidak dalam rentang 1-12, maka error
                break;
        }
        if(monthName == "Error"){ //jika monthName = Error
            System.out.println("Error: Bulan tidak valid (1-12)");//cetak tidak valid
        }
        else{ //jika monthName != Error
            System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ')'); //cetak nama bulan
            }
    
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthDays = 31; //jika month = 1,3,5,7,8,10 atau 12 maka monthDays adalah 31
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                monthDays = 30;
                break;

            case 2:
                monthDays = 28;
                break;

            default:
                monthDays = 0;
                break;
        }
        if(monthDays == 0){ //jika monthDays = 0 
            System.out.println("Error: Bulan tidak valid (1-12)");//cetak tidak valid
        }
        else{ //jika namaBulan != Error
            System.out.println("Jumlah hari: " + monthDays + " hari");
            }
    }
}
