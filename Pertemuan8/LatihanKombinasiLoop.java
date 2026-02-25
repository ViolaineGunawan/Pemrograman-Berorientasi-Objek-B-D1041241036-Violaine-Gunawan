/*
Nama: Violaine Gunawan
NIM: D1041241036
Tanggal: Rabu, 25 Februari 2026
Program: Latihan 4, Pertemuan 8
*/
package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        boolean isFound=false;
        for(int x=1;x<=3;x++){//outer loop
            for(int y=1;y<=5;y++){//inner loop
                System.out.println("Cek: [" + x + "," + y + "]");
                if(x==2 && y==3){
                    System.out.println("Koordinat ditemukan! \nPencarian selesai. ");
                    isFound=true; //jika sudah ketemu maka ketemu = true sebagai parameter untuk memberhentikan outer loop
                    break;//memberhentikan inner loop
                }
            }
            if(isFound){
                break; //jika sudah ketemu koordinat 2,3 maka outer loop berhenti
            }
        }
    }
}
