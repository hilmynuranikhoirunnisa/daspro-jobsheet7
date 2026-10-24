import java.util.Scanner;
public class TiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jumlahTiket, totalTiketTerjual = 0;
        double diskon, totalPenjualan = 0, totalBayar, totalHarga;
        String lanjut;

        do {
            do {
                System.out.println("Masukkan jumlah tiket");
                jumlahTiket = sc.nextInt();
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid");
                    System.out.println("Masukkan ulang");
                }
            } while (jumlahTiket < 0);

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
                hargaTiket = 50000;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
                hargaTiket = 50000;
            } else {
                diskon = 0;
                hargaTiket = 50000;
            }

            totalBayar = totalHarga - (totalHarga * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan +=totalBayar;
            
            System.out.println("Total Harga: Rp" + totalHarga);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total Bayar: Rp" + totalBayar);

            System.out.print("Ada Transaksi lagi? (ya/tidak): ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\nTOTAL PENJUALAN HARIAN");
        System.out.println("Total Tiket Terjual: " + totalTiketTerjual);
        System.out.println("Total Penjualan: Rp" + totalPenjualan);
        sc.close();
    }
}