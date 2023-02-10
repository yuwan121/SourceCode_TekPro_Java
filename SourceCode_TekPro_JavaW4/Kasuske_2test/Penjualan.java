/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Kasuske_2test;

import java.util.Scanner;

/**
 *
 * @author BlackStyle
 */
class Penjualan {
    private String nama_produk;
    private double harga_total;
    private int qty;
    private Penjualan[] pesan = new Penjualan[100];
    private static byte id = 0;
    private Scanner input = new Scanner(System.in);
    
    public Penjualan(String nama_produk, int qty) {
        this.nama_produk = nama_produk;
        this.qty = qty;
    }

    public Penjualan() {
        
    }
    
    public void inputPesanan() {
        char keputusan;
        do {
            Produk.menuProduk();
            System.out.print("Pilih menu (1-" + Produk.getId() + "): ");
            int pilih = input.nextInt();
        if(Produk.menu[pilih-1].getQty()>0){
                pesan[id] = new Penjualan(Produk.menu[pilih - 1].getNama_produk(), Produk.menu[pilih - 1].getQty());
                System.out.print("Berapa banyak? : ");
                pesan[id].qty = input.nextInt();
                if(pesan[id].qty <= Produk.menu[pilih-1].getQty()){
                    pesan[id].harga_total = pesan[id].qty * Produk.menu[pilih - 1].getHarga();
                    Produk.menu[pilih-1].setQty(Produk.menu[pilih-1].getQty() - pesan[id].qty);
                    id++;
                }else{
                    System.out.println("Anda memesan makanan melebihi stok wooi!!!");
                }
            }else{
                System.out.println("Makanan Yang Anda Pesan sudah Habis!");
            }
        System.out.print("Apakah Anda ingin memesan makanan lagi? (Y/N): ");        
        keputusan = input.next().charAt(0);
        } while (keputusan != 'N' && keputusan != 'n');
    }
    
    public void tampilPesanan() {
        double total_harga = 0;
        System.out.println("\nPesanan Anda: ");
        for (int i = 0; i < id; i++) {
        System.out.println((i + 1) + ". " + pesan[i].nama_produk + " = " + pesan[i].qty + " buah");
        total_harga += pesan[i].harga_total;
    }
    System.out.println("Total Bayar: Rp." + total_harga);
}
}