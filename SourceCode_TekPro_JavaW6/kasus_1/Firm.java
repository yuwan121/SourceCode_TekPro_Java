/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_1;

/**
 *
 * @author BlackStyle
 */
//*************************************************************
//	Firm.java	Author: Lewis/Loftus
//
//	Demonstrates polymorphism via inheritance.
//*************************************************************

public class Firm
{
//----------------------------------------------------------
//	Creates a staff of employees for a firm and pays them.
//----------------------------------------------------------
    public static void main (String[] args)
    {
        Staff personnel = new Staff();

        personnel.payday();
    }
}

