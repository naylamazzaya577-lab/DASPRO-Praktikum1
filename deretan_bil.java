import java.util.Scanner;

public class deretan_bil {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();

     // ambil 2 digit terakhir
        int n = (int)(nim % 100);

        if (n < 10) {
         n += 10;
        }
        for (int i = 1; i <= n; i++) {

            // Jangan cetak 10 dan 15
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } 
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            else {
                System.out.print("* ");
            }
        }

        sc.close();
    }
}
