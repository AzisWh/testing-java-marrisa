package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah array: ");
            int n = scanner.nextInt();
            
            int[] numbers = new int[n];
            
            System.out.println("Masukkan isi array:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
            }
            
            System.out.println("Total jumlah: " + sum);
        }
    }
}
