/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

/**
 *
 * @author Yusuf
 */
public class ujibola {
    public static void main (String []arg){
        bola bola= new bola();
        double luas, volume;
        bola.setjari(6);
        luas = bola.showluas();
        volume = bola.showvolume();
        System.out.println("jari-jari adalah : "+bola.showjari());
         System.out.println("\nDiameter adalah : "+bola.showdiameter());
         System.out.println("\nLuasnya adalah : "+bola.showluas());
          System.out.println("\nvolume adalah : "+bola.showvolume());
    }
}
