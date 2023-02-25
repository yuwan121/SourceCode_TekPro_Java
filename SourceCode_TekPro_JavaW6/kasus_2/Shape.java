/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_2;

/**
 *
 * @author BlackStyle
 */
abstract public class Shape {
    private String shapeName;
    
    public Shape(String namaShape)
    {
        shapeName = namaShape;
    }
    
    public abstract double area();
    @Override
    public String toString()
    {
        return " Name of Shape " + shapeName;
    }
}
