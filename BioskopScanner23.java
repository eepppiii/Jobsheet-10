import java.util.Scanner;

public class BioskopScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama :");
            String nama = sc.nextLine();
            System.out.print("Masukkan Baris :");
            int baris = sc.nextInt();
            System.out.print("Masukkan Kolom :");
            int Kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris - 1][Kolom - 1] = nama;
            System.out.print("Input penonton lainnya? (y/n):");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
}