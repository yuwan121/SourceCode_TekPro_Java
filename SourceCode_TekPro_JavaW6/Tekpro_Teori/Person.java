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
public abstract class Person {
    private String name;
    private int tall;
    private int age;
    public Person(String name, int age, int tall){
        this.name = name;
        this.age = age;
        this.tall = tall;
    }
    public abstract void talk();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the tall
     */
    public int getTall() {
        return tall;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
}
