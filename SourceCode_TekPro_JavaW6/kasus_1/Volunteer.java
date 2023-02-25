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
public class Volunteer extends StaffMember {
    //----------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified 
    //  information. 
    //----------------------------------------------------------
    public Volunteer (String eName, String eAddress,String ePhone)
    {
        super (eName, eAddress, ePhone);
    }
    
    //----------------------------------------------------------
    //  Returns a zero pay value for this volunteer. 
    //----------------------------------------------------------
    @Override
    public double pay()
    {
        return 0.0;
    }
}