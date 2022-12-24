/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author muham
 */
public class Persegi extends BangunDatar {
   // Atribut
   double sisi;
   
   // Constructor
   public Persegi(String nama, double sisi) {
      super(nama);
      this.sisi = sisi;
   }
   
   // Method
   @Override
   public double hitungLuas() {
      return sisi * sisi;
   }
   
   @Override
   public double hitungKeliling() {
      return 4 * sisi;
   }
}
