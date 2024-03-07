package Nomor2;

public class Main {
    public static void main(String[] args) {
        // array
        int[] angka = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array sebelum dikali 3 semua:");
        for (int num : angka) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        for (int i = 0; i < angka.length; i++) {
            angka[i] *= 3; // kali 3
        }
        
        // hasil
        System.out.println("Array setelah dikali 3 semua:");
        for (int num : angka) {
            System.out.print(num + " ");
        }
    }
}
