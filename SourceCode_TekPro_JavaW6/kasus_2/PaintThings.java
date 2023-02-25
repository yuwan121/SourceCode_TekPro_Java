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
//*************************************************************
//  PaintThings.java
//
//  Computes the amount of paint needed to paint various
//  things. Uses the amount method of the paint class which
//  takes any Shape as a parameter.
//*************************************************************
import java.text.DecimalFormat;

public class PaintThings 
{
    //----------------------------------------
    //Creates some shapes and a Paint object
    //and prints the amount of paint needed
    //to paint each shape.
    //----------------------------------------
    public static void main(String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        
        deck = new Rectangle(35,20);
        bigBall = new Sphere(15);
        tank = new Cylinder(10,30);
        //Instantiate the three shapes to paint
        double deckAmt, ballAmt, tankAmt;
        //Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        //Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}
