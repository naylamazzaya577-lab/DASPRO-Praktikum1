import java.util.Scanner;

public class jadwalKuliah21 {

    // === VARIABEL GLOBAL ===
    static Scanner input = new Scanner(System.in);
    static String[][] jadwal = new String[10][4];
    static int jumlahData;

    // a. Input data
    public static void inputData() {
        System.out.print("Masukkan jumlah jadwal: ");
        jumlahData = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruangan          : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // b. Tampilkan semua
    public static void tampilSemua() {
        System.out.println("\nDAFTAR JADWAL:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println(
                jadwal[i][0] + " | " +
                jadwal[i][1] + " | " +
                jadwal[i][2] + " | " +
                jadwal[i][3]
            );
        }
    }

    // c. Cari berdasarkan hari
    public static void cariHari() {
        System.out.print("Masukkan hari: ");
        String cari = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
            }
        }
    }

    // d. Cari berdasarkan mata kuliah
    public static void cariMatkul() {
        System.out.print("Masukkan nama mata kuliah: ");
        String cari = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cari)) {
                System.out.println(
                    "Hari: " + jadwal[i][2] +
                    ", Jam: " + jadwal[i][3] +
                    ", Ruang: " + jadwal[i][1]
                );
            }
        }
    }

    // === MAIN (CUMA SATU!) ===
    public static void main(String[] args) {
        inputData();
        tampilSemua();
        cariHari();
        cariMatkul();
    }
}