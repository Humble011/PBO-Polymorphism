/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPolimorfisme;
import java.util.Scanner;
/**
 *
 * @author muham
 */
class Utama 
{
    public static void  main (String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);

        //instance of class
        Manusia[] m = new Manusia[2];
        
        //deklarasi variabel
        int x=0;
        
        do
        {
            //input
                System.out.println("User "+(x+1));
                System.out.println("Masukan tinggi badan anda (cm) = ");
                double t = in.nextDouble();
                System.out.println("Masukan jenis kelamin anda (L/P = )");
                String jk= in.next();
            //proses + output
            if (jk.toUpperCase().equals("L")) 
            {
                m[x]= new Laki_Laki(t);
                System.out.println("Berat badan ideal laki-laki ini anda adalah "+m[x].HtgBBI());
                System.out.println();            
            }
            else
            {
                m[x]= new Perempuan(t);
                System.out.println("Berat badan ideal perempuan ini anda adalah "+m[x].HtgBBI());
                System.out.println(); 
            }
        
            x++;
        }while (x<2);
    }    
}
