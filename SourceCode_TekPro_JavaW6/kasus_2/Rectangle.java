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
/**
 *
 * @author BlackStyle
 */
//*************************************************************
//  Rectangle.java
//
//  Represents a Rectangle.
//*************************************************************
public class Rectangle extends Shape 
{
    private double length;
    private double width;
    //------------------------------------
    //  Constructor: Sets up the rectangle.
    //------------------------------------
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    //--------------------------------------------
    //  Returns the surface area of the rectangle.
    //--------------------------------------------
    @Override
    public double area(){
        return length*width;
    }
    //-----------------------------------------
    //  Returns the rectangle as a String.
    //-----------------------------------------
    @Override
    public String toString(){
        return super.toString() + " of length " + length + " and of width " + width;
    }
}