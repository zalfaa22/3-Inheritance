/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Fafa
 */
public class Persegi extends BangunDatar{
    float sisi;
    
    public void luas(){
        float luas=sisi*sisi;
        System.out.println("Luas Persegi = " + luas);
    }
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling Persegi = " + keliling);
    }
   
}

