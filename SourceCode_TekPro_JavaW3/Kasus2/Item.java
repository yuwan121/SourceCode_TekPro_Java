/*
 * Nama	:  Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Praktek.Kasus2;

/**
 *
 * @author BlackStyle
 */
public class Item {
        // Variabel bernama "name" bertipe String
        private String name;

        // Konstruktor default tanpa parameter
        private Item() {
            // Memberikan nilai default "Ipin" pada variabel "name"
            name = "Ipin";
        }
        
        // Konstruktor publik dengan parameter bertipe String
        public Item(String name) {
            // Memanggil konstruktor default
            this(); 
            // Cetak nilai dari variabel "name"
            System.out.println(this.name);
        }
}

