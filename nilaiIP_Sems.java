import java.util.Scanner;

public class nilaiIP_Sems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                  Program Menghitung IP Semester                         ");
        System.out.println("-------------------------------------------------------------------------");

        // Nama Mata Kuliah
        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        // Bobot SKS masing-masing MK
        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};

        double totalBobotNilai = 0;
        int totalSKS = 0;

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] nilaiSetara = new double[mk.length];

        // INPUT NILAI
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            // Konversi nilai huruf & nilai setara
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobotNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobotNilai / totalSKS;

        // OUTPUT PADA TABEL
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-40s %-12s %-12s %-10s\n",
        "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot");
        System.out.println("---------------------------------------------------------------------------------");

            for (int i = 0; i < mk.length; i++) {
        System.out.printf("%-40s %-12.2f %-12s %-10.2f\n",
            mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("=================================================================================");
        System.out.printf("IP Semester : %.2f\n", ip);

        sc.close();
    }
}
