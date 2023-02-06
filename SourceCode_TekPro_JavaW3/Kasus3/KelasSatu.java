/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek.Kasus3;

/**
 *
 * @author BlackStyle
 */
public class KelasSatu {
        //Instance initialization block
        {
            System.out.println(11);
        }
        //Static initalization/Class initialization block
        static
        {
            System.out.println(2);
        }
        //Constructor
        public KelasSatu(int i)
        {
            System.out.println(3);
        }
        //Constructor
        public KelasSatu()
        {
            System.out.println(4);
        }
}

/*
Hirarki nya yaitu seperti : 
1. Static initalization (Hanya sekali saat program dijalankan)
2. Instance initialization block
3. Constructor
Jadi program akan mengeksekusi Static initalization/Class initialization block terlebih dahulu
dan ini dijalankan hanya sekali, setelah itu program akan menjalankan Instance initialization block,
dan yang terakhir program akan menjalankan Constructor yang sesuai dengan yang ada di Main Program
Referensi : 
https://stackoverflow.com/questions/3987428/what-is-an-initialization-block
https://www.javatpoint.com/instance-initializer-block
*/
