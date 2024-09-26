/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author 62898
 */
public class IMTCalculator {
    public static void main(String[] args) {
        //Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        
        //Input berat badan dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        
        //Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        
        //Menentukan kategori IMT
        String kategori;
        if (imt <= 18.4) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }
        
        //Tampilkan output
        System.out.println("Indeks Massa Tubuh (IMT): " + imt);
        System.out.println("Kategori: " + kategori);
    }
}
