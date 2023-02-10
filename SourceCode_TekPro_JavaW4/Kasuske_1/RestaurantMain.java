package Kasuske_1;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		System.out.println("=====Makanan sebelum dipesan=====");
		menu.tampilMenuMakanan();
		System.out.println("=====Makanan sesudah dipesan=====");
		menu.memesan_Makanan("Bala-Bala", 20);
		menu.tampilMenuMakanan();
                menu.cek_stok("Bala-Bala");
	}

}
