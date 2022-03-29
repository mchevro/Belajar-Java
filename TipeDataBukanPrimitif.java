/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutor_PZN;

/**
 *
 * @author Mahendra Chevro
 */
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        
        //Value kosong/null
        Byte iniByte = null;
        System.out.println(iniByte);
        
        //Konversi Number
        short iniShort = 20;
        Short iniObject = iniShort;
        
        Integer iniInterger2 = iniObject.intValue();
        System.out.println(iniInterger2);
    }
}
