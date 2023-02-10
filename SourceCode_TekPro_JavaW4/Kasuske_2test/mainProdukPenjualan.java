/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Kasuske_2test;

/**
 *
 * @author BlackStyle
 */
public class mainProdukPenjualan {
        public static void main(String[] args) {
        Produk daftarPesan = new Produk();
        daftarPesan.tambahPesanan("Ayam Goreng", 20000, 10);
        daftarPesan.tambahPesanan("Nasi Goreng", 15000, 20);
        daftarPesan.tambahPesanan("Mie Goreng", 17000, 30);
        daftarPesan.tambahPesanan("Bakso", 25000, 15);
        daftarPesan.tambahPesanan("Sate", 30000, 25);
        daftarPesan.tambahPesanan("Sop Ayam", 22000, 10);
        daftarPesan.tambahPesanan("Gado-Gado", 18000, 20);
        daftarPesan.tambahPesanan("Ketoprak", 22000, 20);
        daftarPesan.tambahPesanan("Rawon", 27000, 20);
        daftarPesan.tambahPesanan("Nasi Campur", 25000, 20);
        Penjualan pesanMakan = new Penjualan();
        pesanMakan.inputPesanan();
        pesanMakan.tampilPesanan();
    }
}
