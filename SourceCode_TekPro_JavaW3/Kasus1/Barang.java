/*
 * Nama	:  Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Praktek.Kasus1;

/**
 *
 * @author BlackStyle
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    //Constructor
       public Barang(String kode, String nama, int stk) {       
      kode_barang = kode;
      nama_barang = nama;
      this.stok = stk;
      /*
        Konstruktor dari kelas 'Barang'(Blueprint) yang isinya terdapat kode,nama dan stok barang
      */
       }
       
       public void addStok( int _stok){
           this.stok += _stok; //Untuk menambah stok dari stok suatu objek tertentu
       }
       
       public int getStok(){{
           return this.stok; //Untuk mengambil nilai stok dari suatu objek tertentu
       }
       
}
}