package linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah list: ");
            int n = scanner.nextInt();
            
            LinkedList<Integer> numbers = new LinkedList<>();
            
            System.out.println("Masukkan isi list:");
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextInt());
            }
            
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            
            System.out.println("Total jumlah: " + sum);
        }
    }
}
