package Nomor4;
import java.util.Scanner;

//palindrom itu kata yang kalo dibalik bacanya tetep sama, cth katak, radar, level dll

public class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        // input string
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String kata = scanner.nextLine();
        // method pengecekan
        boolean hasil = cekPalindrome(kata);
        
        // output
        if (hasil) {
            System.out.println("String \"" + kata + "\" adalah palindrome.");
        } else {
            System.out.println("String \"" + kata + "\" bukan palindrome.");
        }
        scanner.close();
    }
    
    // method pengecekan
    public static boolean cekPalindrome(String kata) {
        // delete spasi dan mengganti ke huruf kecil
        kata = kata.replaceAll("\\s+", "").toLowerCase();
        
        // Memeriksa tiap karakter dari pertama dan terakhir, kedua pertama dan kedua terakhir, dst
        for (int i = 0; i < kata.length() / 2; i++) {
            if (kata.charAt(i) != kata.charAt(kata.length() - 1 - i)) {
                return false; // false jika salah
            }
        }
        return true; // true jika benar
    }
}
