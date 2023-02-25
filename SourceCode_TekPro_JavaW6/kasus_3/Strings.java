/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_3;

/**
 *
 * @author BlackStyle
 */
//**********************************************************
//  Strings.java        
//
//  Demonstrates the selectionSort on a String.
//**********************************************************

import java.util.Scanner;

public class Strings {
    //-----------------------------------------------------------------
    //  Reads in String, sorts them,
    //  then prints them in sorted order.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Comparable[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow many words do you want to sort? ");
        size = scan.nextInt();
        intList = new Comparable[size];
        
        System.out.println ("\nEnter the word...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.next();
        
        Sorting.selectionSort(intList);
        System.out.println ("\nYour words in sorted order");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println ();
        Sorting.insertionSort(intList);
        System.out.println ("\nYour words in sorted order (Descending)");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println ();
    }
}
