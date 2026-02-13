public class RoyalGarden21 {
    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;
    
    public static void hitungPendapatan(int[][] stok, int[] totalPendapatan) {

        for (int i = 0; i < stok.length; i++) {

            totalPendapatan[i] =
                    (stok[i][0] * hargaAglonema) +
                    (stok[i][1] * hargaKeladi) +
                    (stok[i][2] * hargaAlocasia) +
                    (stok[i][3] * hargaMawar);
        }
    }
        public static void tentukanStatus(int[] totalPendapatan, String[] status) {

        for (int i = 0; i < totalPendapatan.length; i++) {

            if (totalPendapatan[i] > 1500000) {
                status[i] = "Sangat Baik";
            } else {
                status[i] = "Perlu Evaluasi";
            }
        }
    }

    public static void main(String[] args) {

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] totalPendapatan = new int[4];
        String[] status = new String[4];

        // Panggil fungsi
        hitungPendapatan(stok, totalPendapatan);
        tentukanStatus(totalPendapatan, status);

        // Output
        for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp " + totalPendapatan[i]);
            System.out.println("Status     : " + status[i]);
            System.out.println("----------------------------------");
        }
    }
}
    

