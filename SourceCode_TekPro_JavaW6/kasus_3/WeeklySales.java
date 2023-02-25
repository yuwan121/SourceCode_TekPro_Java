/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus_3;
import java.util.Scanner;
/**
 *
 * @author BlackStyle
 */
//**********************************************************
//  WeeklySales.java        
//
//  Sorts the sales staff in descending order by sales.
//**********************************************************
public class WeeklySales 
{
    public static void main(String[] args)
    {
//        Salesperson[] salesStaff = new Salesperson[10];
//        
//        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//        salesStaff[2] = new Salesperson("James", "Jones", 3000);
//        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
//        
        int size,totalSales;
        String firstName,lastName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mau berapa orang ?");
        size = scan.nextInt();
        scan.nextLine();
        Salesperson[] salesStaff = new Salesperson[size];
        for (int i=0; i<size; i++){
            System.out.println("Masukkan nama depannya [" + (i+1) + "]: ");
            firstName = scan.nextLine();
            System.out.println("Masukkan nama belakangnya [" + (i+1) + "]: ");
            lastName = scan.nextLine();
            System.out.println("Masukkan jumlah penjualannya [" + (i+1) + "]: ");
            totalSales = scan.nextInt();
            scan.nextLine();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }
        Sorting.insertionSort(salesStaff);
        
        System.out.println ("\nRanking of Sales for the Week\n");
        
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}
