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
public class Inventori {
        Barang[] barangs;
        
        void initBarang() {
        /*
            Membuat objek-objek dari tipe data Barang
        */
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
        }
        
        void showBarang() {
        /*
            Menampilkan ke layar objek-objek dari tipe data Barang
        */        
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
        }
        
        void pengadaan() {
        //Menambahkan stok dari objek Barang yaitu barangs[0] dan menampilkan ke layar objek-objek dari tipe data Barang
        initBarang();
        barangs[0].addStok(20);
        showBarang();
        }
        
        public static void main(String[] args) {
        Inventori beli = new Inventori(); //Deklarasi variabel beli bertipe data Inventori yang isinya sebuah objek
                                          //yang dapat digunakan untuk memanggil metode dan mengakses properti dari kelas Inventori
        beli.pengadaan();
        }
}