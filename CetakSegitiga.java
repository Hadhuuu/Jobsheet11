import java.util.Scanner;

public class CetakSegitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // spasi
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                // tambah angka
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                // Pindah baris
                System.out.println();
            }
        }
    }
}