/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Yusuf
 */
public class ujibus {
    public static void main (String[] arg){
        Bus busbesar = new Bus (40);
        busbesar.cetak();
        
        busbesar.addpenumpang(15);
        busbesar.cetak();
        
        busbesar.addpenumpang(5);
        busbesar.cetak();
        
        busbesar.addpenumpang(26);
        busbesar.cetak();}
        
        
}
