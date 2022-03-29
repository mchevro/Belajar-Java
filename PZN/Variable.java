/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor_PZN;

/**
 *
 * @author Mahendra Chevro
 */
public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Mahendra Chevro";
        
        int umur = 18;
        String address = "Indonesia";
        
        System.out.println(name);
        System.out.println(umur);
        System.out.println(address);
        
        //Ganti Value Dari Variable name
        name = "Chevro";
        System.out.println(name);
        
        //Membuat Variable Tanpa Harus Menyebutkan Tipe Datanya
        //Tapi harus langsung isi valuenya
        var firstname = "Mahendra";
        var lastname = "Chevro";
        
        System.out.println(firstname);
        System.out.println(lastname);
        
        //Membuat Variable Konstan Dengan Kata Kunci final
        //final tidak akan bisa diubah isi valuenya.
        final String username = "mchevro";
        final var password = "asd123";
        
        System.out.println(username);
        System.out.println(password);
    }
}