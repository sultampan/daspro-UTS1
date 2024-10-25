import java.util.Scanner;

public class nilaisiswa22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSiswa = 0;
        int jumlahDiatasRataRata = 0;
        int jumlahDibawahRataRata = 0;
        double totalNilai = 0;
        double RataRata = 0;

        while (true) {
            System.out.println("Masukkan nama siswa (atau ketik 'selesai' untuk berhenti): ");
            String nama = input.nextLine();

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.println("Masukkan Nilai Siswa: ");
            double nilai = input.nextDouble();
            input.nextLine(); // Mengatasi newline setelah nextDouble

            totalNilai += nilai;
            jumlahSiswa++;

            RataRata = totalNilai / jumlahSiswa;

            if (nilai > RataRata) {
                jumlahDiatasRataRata++;
            } else if (nilai < RataRata) {
                jumlahDibawahRataRata++;
            }
        }

        if (jumlahSiswa == 0) {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
            return;
        }

        if (RataRata < 75) {
            System.out.println("Rata-rata nilai kelas: " + RataRata);
            System.out.println("Jumlah siswa yang mendapatkan nilai di atas rata-rata: " + jumlahDiatasRataRata);
            System.out.println("Jumlah siswa yang mendapatkan nilai di bawah rata-rata: " + jumlahDibawahRataRata);

            boolean mayoritasDiatasRataRata = jumlahDiatasRataRata > (jumlahSiswa / 2);

            if (mayoritasDiatasRataRata) {
                System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
            } else {
                System.out.println("Mayoritas siswa tidak memiliki nilai di atas rata-rata.");
            }

        } else {
            System.out.println("Rata-rata nilai kelas adalah " + RataRata + ", yang lebih dari 75.");
        }

        input.close();
    }
}
