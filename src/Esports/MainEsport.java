/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esports;
import java.util.Scanner;

/**
 *
 * @author muham
 */
class MainEsport
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
        
      //instance of class
      Esport[] ES = new Esport [5];
      
      System.out.println("==============================================================");
      System.out.println("                  POLIMORFISME ESPORT                         ");
      System.out.println("==============================================================");
      //input 
      System.out.print("Masukkan nama game: ");
      String namaGame = in.nextLine();
      
      //proses+output
      Esport game;
      if (namaGame.equalsIgnoreCase("Dota 2")) {
         game = new Dota("MOBA", 10, "PC");
      } else if (namaGame.equalsIgnoreCase("Valorant")) {
         game = new Valorant("FPS", 5, "PC");
      } else if (namaGame.equalsIgnoreCase("Fifa")) {
         game = new Fifa("Sports", 2, "Konsol");
      } else if (namaGame.equalsIgnoreCase("Mobile Legend")) {
         game = new MobileLegends("MOBA", 5, "Mobile");
      } else if (namaGame.equalsIgnoreCase("PUBG Mobile")) {
         game = new Pubg("Battle Royale", 100, "Mobile");
      } else {
         System.out.println("Game tidak ditemukan");
         return;
      }
      
      game.info();
      System.out.println("==============================================================");
   }
}
    
