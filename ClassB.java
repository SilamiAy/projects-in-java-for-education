/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extends;

public class ClassB extends ClassA{
    public int z;
    
    public void getNilaiZ(){
        System.out.println("Nilai Z : " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : " + (x + y + z));
    }
}

