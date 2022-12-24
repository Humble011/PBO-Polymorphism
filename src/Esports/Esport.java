/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esports;

/**
 *
 * @author muham
 */
public class Esport {
   // Atribut
   String genre;
   int jumlah;
   String platform;
   
   // Constructor
   public Esport(String genre, int jumlah, String platform) {
      this.genre = genre;
      this.jumlah = jumlah;
      this.platform = platform;
   }
   
   // Method
   public void info() {
      System.out.println("Genre: " + genre);
      System.out.println("Jumlah pemain: " + jumlah);
      System.out.println("Platform: " + platform);
   }
}

