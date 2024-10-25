import java.util.Scanner;

public class stokbarang22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        int stokBarang, hargaPerUnit, totalNilaiStok = 0;

        while (true) {
            System.out.println("\n== Manajemen Stok Barang Toko ==");
            System.out.print("Masukkan nama barang (ketik 'selesai' untuk keluar): ");
            namaBarang = input.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan jumlah stok: ");
            stokBarang = input.nextInt();

            System.out.print("Masukkan harga per unit: ");
            hargaPerUnit = input.nextInt();
            input.nextLine();

            int nilaiStokBarang = stokBarang * hargaPerUnit;
            totalNilaiStok += nilaiStokBarang;

            System.out.println("Total nilai stok untuk " + namaBarang + ": Rp " + nilaiStokBarang);

            System.out.print("Masukkan jumlah permintaan produk: ");
            int permintaan = input.nextInt();
            input.nextLine();

            if (permintaan <= stokBarang) {
                stokBarang -= permintaan;
                System.out.println("Permintaan dapat dipenuhi. Sisa stok: " + stokBarang);
            } else {
                System.out.println("Permintaan tidak dapat dipenuhi. Stok tidak mencukupi.");
            }
        }

        System.out.println("\n== Laporan Stok Barang Toko ==");
        System.out.println("Total nilai seluruh stok: Rp " + totalNilaiStok);
        System.out.println("Terima kasih telah menggunakan program manajemen stok.");

        input.close();
    }
}
