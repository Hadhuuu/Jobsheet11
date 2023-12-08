import java.util.Scanner;

public class NesstedLoop12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] temps = new double[5][7];
        for (int i=0;i<temps.length;i++) {
            System.out.println("City: "+ i);
            for (int j=0;j<temps[0].length; j++) {
                System.out.print("Day " +(j+1)+ ": ");
                temps[i][j]=scanner.nextDouble();
            }
        System.out.println();
        }
        for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}