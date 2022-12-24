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
public class Segitiga extends BangunDatar {
// Atribut
double alas;
double tinggi;
double sisiMiring;

// Constructor
public Segitiga(String nama, double alas, double tinggi, double sisiMiring) {
super(nama);
this.alas = alas;
this.tinggi = tinggi;
this.sisiMiring = sisiMiring;
}

// Method
@Override
public double hitungLuas() {
return 0.5 * alas * tinggi;
}

@Override
public double hitungKeliling() {
return alas + tinggi + sisiMiring;
}
}