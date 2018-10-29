/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan59.detectiveconan;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan dua karakter
 * 
 */
public class Tokoh extends Identitas{
    
    private String namaLain;

    public Tokoh(String namaLain, String nama, int umur) {
        super(nama, umur);
        this.namaLain = namaLain;
        System.out.println("Nama : " +nama );
        System.out.println("Di kenal sebagai : " +namaLain );
        System.out.println("Umur : " +umur );
    }

    public String getNamaLain() {
        return namaLain;
    }
   
    
}
