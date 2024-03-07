package Nomor5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jenis mobil :");
        String jenisMobil = scanner.nextLine();
        
        System.out.print("Masukkan waktu parkir per jam: ");
        double waktuParkir = scanner.nextDouble();
        
        // method hitung
        double biayaParkir = BiayaParkir(waktuParkir);
        
        // output
        System.out.println("\njenis Mobil: " + jenisMobil);
        System.out.println("Waktu Parkir: " + waktuParkir + " jam");
        System.out.println("Biaya Parkir: Rp." + biayaParkir);
        
        scanner.close();
    }
    
    public static double BiayaParkir(double waktuParkir) {
        // tarif
        double tarif = 2000;
        
        // hitung
        double biaya = waktuParkir * tarif;
        
        return biaya;
    }
}
