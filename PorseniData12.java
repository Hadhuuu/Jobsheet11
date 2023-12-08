import java.util.Scanner;

public class PorseniData12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahPoliteknik = 5;
        int jumlahCabangOlahraga = 4;

        String[][][] dataPemain = new String[jumlahPoliteknik][jumlahCabangOlahraga][5];
        for (int politeknik = 0; politeknik < jumlahPoliteknik; politeknik++) {
            for (int cabangOlahraga = 0; cabangOlahraga < jumlahCabangOlahraga; cabangOlahraga++) {
                System.out.println("Masukkan data pemain dari politeknik ke-" + (politeknik + 1) +
                        " dan cabang olahraga ke-" + (cabangOlahraga + 1) + ":");

                for (int i = 0; i < 5; i++) {
                    System.out.print("Nama pemain " + (i + 1) + ": ");
                    dataPemain[politeknik][cabangOlahraga][i] = scanner.next();
                }
            }
        }
        System.out.println("\nData Pemain Sebelum Diurutkan:");
        for (int politeknik = 0; politeknik < dataPemain.length; politeknik++) {
            for (int cabangOlahraga = 0; cabangOlahraga < dataPemain[0].length; cabangOlahraga++) {
                System.out.println("\nPoliteknik ke-" + (politeknik + 1) +
                        " | Cabang Olahraga ke-" + (cabangOlahraga + 1) + ":");
                for (int i = 0; i < 5; i++) {
                    System.out.println("   " + dataPemain[politeknik][cabangOlahraga][i]);
                }
            }
        }
        for (int politeknik = 0; politeknik < dataPemain.length; politeknik++) {
            for (int cabangOlahraga = 0; cabangOlahraga < dataPemain[0].length; cabangOlahraga++) {
                String[] temp = new String[5];
                for (int i = 0; i < 5; i++) {
                    temp[i] = dataPemain[politeknik][cabangOlahraga][i];
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 - i; j++) {
                        if (temp[j].compareTo(temp[j + 1]) > 0) {
                            String tempPlayer = temp[j];
                            temp[j] = temp[j + 1];
                            temp[j + 1] = tempPlayer;
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    dataPemain[politeknik][cabangOlahraga][i] = temp[i];
                }
            }
        }
        System.out.println("\nData Pemain Setelah Diurutkan (Secara Ascending):");
        for (int politeknik = 0; politeknik < dataPemain.length; politeknik++) {
            for (int cabangOlahraga = 0; cabangOlahraga < dataPemain[0].length; cabangOlahraga++) {
                System.out.println("\nPoliteknik ke-" + (politeknik + 1) +
                        " | Cabang Olahraga ke-" + (cabangOlahraga + 1) + ":");
                for (int i = 0; i < 5; i++) {
                    System.out.println("   " + dataPemain[politeknik][cabangOlahraga][i]);
                }
            }
        }
    }
}
