/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor_PZN;

/**
 *
 * @author Mahendra Chevro
 */
public class KonversiNumber {
    public static void main(String[] args) {
        /*Konversi Tipe Data Number
        Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte
        */
        
        //Looks Good
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        
        //Jangan Konversi Dari Besar Ke Kecil, Nanti Akan Terjadi Number Overflow
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
