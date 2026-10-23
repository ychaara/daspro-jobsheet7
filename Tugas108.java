import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, jmlTiket = 0, totalTiket = 0;
        double totalJual = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket(0 untuk selesai): ");
            jmlTiket = sc.nextInt();
            if (jmlTiket == 0) {
                break;
            }
            double diskon = 0;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = (hargaTiket - (hargaTiket * diskon)) * jmlTiket;
            totalTiket += jmlTiket;
            totalJual += totalHarga;

            System.out.println("Jumlah Tiket:" + jmlTiket);
            System.out.println("Diskon: " + diskon * 100 + "%");
            System.out.println("Total Harga: Rp " + totalHarga);

        }
        System.out.println("Total Tiket Terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalJual);
        sc.close();
    }
}