package Kasuske_1;

public class Menu {
	private String nama_makanan;
	private double  harga_makanan;
	private int stok;
        private static byte id = 0;

    public Menu(String nama, double harga, int stok_tersedia){
       this.nama_makanan = nama;
       this.harga_makanan = harga;
       this.stok = stok_tersedia;
    }    
    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the nama_makanan
     */
    public String getNama_makanan() {
        return nama_makanan;
    }

    /**
     * @param nama_makanan the nama_makanan to set
     */
    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    /**
     * @return the harga_makanan
     */
    public double getHarga_makanan() {
        return harga_makanan;
    }
        
        
}
