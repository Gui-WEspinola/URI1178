package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int cityA = scanner.nextInt();
            int cityB = scanner.nextInt();
            double growthA = scanner.nextDouble();
            double growthB = scanner.nextDouble();
            int years = 0;

            while (cityB >= cityA) {
                cityA += (cityA * growthA) / 100;
                cityB += (cityB *growthB) / 100;
                years++;
                if (years > 100){
                    break;
                }
            }
            if (years <= 100) {
                System.out.println(years + " anos.");
            } else
                System.out.println("Mais de 1 seculo.");
        }
        scanner.close();
    }
}