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
public class DiskonPembelian {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        
        //Menginputkan total pembelian
        System.out.print("Total pembelian Rp. ");
        double totalPembelian = input.nextDouble();
        
        //Menentukan potongan dan total bayar
        double potongan, totalBayar;
        
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }
        
        //Menghitung jumlah yang harus dibayar
        totalBayar = totalPembelian - potongan;
        
        //Tampilkan output 
        System.out.println("Total pembelian Rp. " + totalPembelian);
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
    }
}
