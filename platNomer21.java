import java.util.Scanner;

public class platNomer21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A','B','D','E','F','H','L','N','T','Z'};

        char[][] KOTA = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.print("Masukkan kode plat: ");
        char kodeInput = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (kodeInput == KODE[i]) {
                System.out.print("Kota asal: ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                break;
            }
        }

        sc.close();
    }
}
