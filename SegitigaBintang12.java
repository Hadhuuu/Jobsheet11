import java.util.Scanner;

public class SegitigaBintang12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = scanner.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5.");
        } else {
            for (int i = N; i >= 1; i--) {
                // Mencetak bintang
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                // Pindah ke baris berikutnya
                System.out.println();
            }
        }
    }
}
