package Nomor3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        // wajib string untuk kalimat
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String kata = scanner.nextLine();
        // method balik kata
        String hasil = balikKata(kata);
        
        // output
        System.out.println("Hasil pembalikan: " + hasil);
        
        scanner.close();
    }
    
    // method balik kata
    public static String balikKata(String kata) {
        // membuat objek stringbuilder
        StringBuilder sb = new StringBuilder();
        
        // Memasukkan karakter dari string asli ke StringBuilder dari akhir ke awal
        for (int i = kata.length() - 1; i >= 0; i--) {
            sb.append(kata.charAt(i));
        }
        
       
        return sb.toString();
    }
}
