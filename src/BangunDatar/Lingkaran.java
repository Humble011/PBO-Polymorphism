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
public class Lingkaran extends BangunDatar {
   // Atribut
   private double jariJari;
   
   // Constructor
   public Lingkaran(String nama, double jariJari) {
      super(nama);
      this.jariJari = jariJari;
   }
   
   // Method
   @Override
   public double hitungLuas() {
       return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
