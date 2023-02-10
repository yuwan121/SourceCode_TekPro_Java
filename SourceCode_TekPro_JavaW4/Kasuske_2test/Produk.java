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
import java.util.Scanner;

class Produk {
    private String nama_produk;
    private double harga;
    private int qty;
    private static byte id = 0;
    public static Produk[] menu = new Produk[10];
    
    public Produk() {

    }
    
    public Produk(String nama_produk, double harga, int qty) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
    }
    
    public void tambahPesanan(String nama_produk, double harga, int qty) {
        menu[getId()] = new Produk(nama_produk, harga, qty);
        id++;
    }
    
    public static void menuProduk() {
        System.out.println("Menu Produk: ");
        for (int i = 0; i < getId(); i++) {
            if(menu[i].qty>0){
                System.out.println((i + 1) + ". " + menu[i].getNama_produk()+'['+ menu[i].getQty() +']' + " Rp." + menu[i].getHarga());
            }else{
                System.out.println("Stok Habis, Silahkan pesan yang lain!");
            }
        }
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @return the nama_produk
     */
    public String getNama_produk() {
        return nama_produk;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @return the id
     */
    public static byte getId() {
        return id;
    }

    /**
     * @return the harga
     */

}