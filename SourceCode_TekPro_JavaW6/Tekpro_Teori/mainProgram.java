/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tekpro_Teori;

/**
 *
 * @author BlackStyle
 */
public class mainProgram {
    public static void main(String[]args){
        Person orang;
        orang = new Employee("Budi",26,165,8);
        orang.talk();
        
        Worker pekerja;
        pekerja = new Lecturer("Loki",32,170,"Teknik Pemrograman") {};
        pekerja.job();
    }
}
