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
public class encapsiswa {
private String name;
private String address;
private int absen;

public int getabsen(){
    return absen;
}
public String getname(){
    return name;
}
public String getaddress(){
    return address;
}
public void getabsen(int newabsen){
    absen = newabsen;
}
public void getname(String newname){
    name = newname;
}
public void getaddress(String newaddress){
   address = newaddress;
}

}
