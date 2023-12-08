import java.util.Scanner;
import java.util.Random;

public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success= (answer == number);
                if(answer>number){
                    System.out.println("angka anda lebih kecil dari angka yang benar");
                } else if (answer<number) {
                    System.out.println("angka anda lebih besar dari angka yang benar");
                } else {
                    System.out.println("Selamat anda benar");
                }
            } while (! success);
            System.out.print("Apakah anda ingin mengulangi permainan (Y/T)");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}