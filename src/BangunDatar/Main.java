/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;
import java.util.Scanner;
/**
 *
 * @author muham
 */
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    BangunDatar[] BD = new BangunDatar[4];
            
    //input
    System.out.print("Masukkan nama bangun datar: ");
    String nama = in.nextLine();
    
    //proses+output
    BangunDatar bangunDatar;
    if (nama.equalsIgnoreCase("Persegi")) {
        System.out.print("Masukkan panjang sisi: ");
        double sisi = in.nextDouble();
        bangunDatar = new Persegi(nama, sisi);
    } else if (nama.equalsIgnoreCase("Persegi Panjang")) {
        System.out.print("Masukkan panjang: ");
        double panjang = in.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = in.nextDouble();
        bangunDatar = new PersegiPanjang(nama, panjang, lebar);
    } else if (nama.equalsIgnoreCase("Lingkaran")) {
        System.out.print("Masukkan jari-jari: ");
        double jariJari = in.nextDouble();
        bangunDatar = new Lingkaran(nama, jariJari);
    } else if (nama.equalsIgnoreCase("Segitiga")) {
        System.out.print("Masukkan panjang alas: ");
        double alas = in.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = in.nextDouble();
        System.out.print("Masukkan panjang sisi miring: ");
        double sisiMiring = in.nextDouble();
        bangunDatar = new Segitiga(nama, alas, tinggi, sisiMiring);
     } else {
        System.out.println("Bangun datar tidak ditemukan");
        return;
        }
     System.out.println("Apakah Anda ingin menghitung luas atau keliling? ");
        String pilihan = in.next();
        if (pilihan.equalsIgnoreCase("luas")) {
           System.out.println("Luas " + nama + ": " + bangunDatar.hitungLuas());
        } else if (pilihan.equalsIgnoreCase("keliling")) {
           System.out.println("Keliling " + nama + ": " + bangunDatar.hitungKeliling());
        } else {
           System.out.println("Input tidak valid");
        }
    }
}