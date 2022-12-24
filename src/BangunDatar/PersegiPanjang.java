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
public class PersegiPanjang extends BangunDatar {
   // Atribut
   double panjang;
   double lebar;
   
   // Constructor
   public PersegiPanjang(String nama, double panjang, double lebar) {
      super(nama);
      this.panjang = panjang;
      this.lebar = lebar;
   }
   
   // Method
   @Override
   public double hitungLuas() {
      return panjang * lebar;
   }
   
   @Override
   public double hitungKeliling() {
      return 2 * (panjang + lebar);
   }
}
