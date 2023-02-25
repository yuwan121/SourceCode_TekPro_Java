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
public class Employee extends Person implements Worker {
    int work_hours;
    
    public Employee(String name,int age, int tall, int man_hours){
        super(name,age,tall);
        work_hours = man_hours;
    }
    
    @Override
    public void talk(){
        System.out.println("Hallo!, nama saya " + super.getName() + ", tinggi badan saya adalah " + super.getTall());
    }
    
    @Override
    public void job(){
        System.out.println("Hallo!, nama saya " + super.getName() + ", saya punya " + work_hours + " jam, setiap harinya");
    }
}
