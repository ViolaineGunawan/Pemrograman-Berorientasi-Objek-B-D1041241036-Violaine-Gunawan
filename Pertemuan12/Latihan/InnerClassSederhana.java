/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 18 Maret 2026
Program: Latihan 2: Inner Class Sederhana Pertemuan 12
*/

package Pertemuan12.Latihan;

class Sekolah{//class sekolah
    String namaSekolah; 
    Sekolah(String nama) {//constructor outer class
        namaSekolah = nama;
    }
    class Kelas{
        String namaKelas;
        Kelas(String kelas) {//constructor inner class
            namaKelas = kelas;
        }
        public void info(){//method inner class
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

public class InnerClassSederhana {
    public static void main(String[] args) {
        Sekolah sekolah1 = new Sekolah("SMA Negeri 1"); //buat objek outer class dahulu
        Sekolah.Kelas kelas1 = sekolah1.new Kelas("X-A");//buat objek inner class
        kelas1.info();//akses method inner class
    }
}
