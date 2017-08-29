/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Yusuf
 */
public class testsiswa {
    public static void main (String arg[]) {
    encapsiswa siswa=new encapsiswa();
    siswa.getname("Julian ");
    siswa.getabsen(23);
    siswa.getaddress(" Malang");
    System.out.print(" name: "+ siswa.getname() +" Absen :"+ siswa.getabsen() +" Alamat:"+ siswa.getaddress());
    }
}
