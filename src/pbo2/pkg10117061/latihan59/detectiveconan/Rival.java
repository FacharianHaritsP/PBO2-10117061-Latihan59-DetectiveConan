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
public class Rival extends Identitas{
    
     private String alias;

    public Rival(String alias, String nama, int umur) {
        super(nama, umur);
        this.alias = alias;
        System.out.println("\nNama : " +nama );
        System.out.println("Di kenal sebagai : " +alias );
        System.out.println("Umur : " +umur );
    }

    public String getAlias() {
        return alias;
    }
     
     
}
