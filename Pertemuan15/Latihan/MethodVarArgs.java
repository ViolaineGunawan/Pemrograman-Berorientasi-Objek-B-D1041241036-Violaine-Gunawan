/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Sabtu, 21 Maret 2026
Program: Latihan 2: Method VarArgs Pertemuan 15
*/

package Pertemuan15.Latihan;

public class MethodVarArgs {

    static double hitungRataRata(int... nilai){//method hitung rata-rata dengan jumlah nilai yang fleksibel
        if(nilai.length == 0){//jika panjang nilai yang diinput saat memanggil method adalah 0 maka mengembalikan nilai 0 (untuk kasus jika tidak ada nilai yang diinput sama sekali)
            return 0;
        }
        int total = 0;
        for(int n : nilai){
            total+=n; //menjumlahkan semua nilai yang diinput saat memanggil method
        }
        return (double) total / nilai.length; //mengemabalikan rata-rata
    }
    public static void main(String[] args) {
        System.out.println("Rata-rata (3 nilai): " + hitungRataRata(60,90,90));//memanggil method dengan 3 parameter
        System.out.println("Rata-rata (5 nilai): " + hitungRataRata(86,86,86,100,72));//memanggil method dengan 5 parameter
    }
}
