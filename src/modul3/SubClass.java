/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Fafa
 */
public class SubClass extends SuperClass{
    String nama = "¿😍";
    int umur = 16;
    
public void cetak(){
    System.out.println("Dia itu : "+super.sifat);
    System.out.println("namanya : "+nama);
    System.out.println("umur : "+umur);
    System.out.println("Tinggi badannya : "+super.TB);
    super.hobbi();
}
}
