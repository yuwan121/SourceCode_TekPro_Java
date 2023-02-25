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
public class Lecturer extends Person implements Worker {
    String subject;
    
    public Lecturer (String name,int age, int tall, String mata_pelajaran){
        super(name,age,tall);
        subject = mata_pelajaran;
    }
    
    @Override
    public void talk(){
        System.out.println("Hallo!, nama saya " + super.getName() + ", umur saya adalah " + super.getAge());
    }
    
    @Override
    public void job(){
        System.out.println("Hallo!, nama saya " + super.getName() + ", saya adalah dosen mata kuliah " + subject);
    }
}
