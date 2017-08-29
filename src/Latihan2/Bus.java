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
public class Bus {
    private int penumpang;
    private int maxpenumpang;
    
    public Bus (int maxpenumpang){
    this.maxpenumpang = maxpenumpang;
    penumpang = 0;}
    
    public void addpenumpang(int penumpang) {
    int temp ;
    temp = this.penumpang+penumpang;
    if (temp >= maxpenumpang){
        System.out.println("Penumpang Melebihi Kuota");
        
    }else {
        this.penumpang = temp;
    }
    }
    public void cetak() {
    System.out.println("Penumpang bus sekarang adalah"+penumpang );
    System.out.println("Penumpang maksimum seharusnya adalah"+maxpenumpang );
    }
    
}
