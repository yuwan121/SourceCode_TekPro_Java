package Kasuske_1;

public class Restaurant {
	private static byte id = 0;
	private Menu[] menu;
	
        public Restaurant(){
           menu = new Menu[10];
        }

	public void tambahMenuMakanan(String nama, double harga, int stok) {
            menu[id] = new Menu(nama,harga,stok);
            id++;
	}        
	
	public void tampilMenuMakanan() {
		for(int i=0; i<id;i++) {
			if(!isOutOfStock(i)) {
                            System.out.println(menu[i].getNama_makanan()+"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
			}else{
                            System.out.println("Stok sedang kosong~!");
                        
                        }
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(menu[id].getStok() <= 0) {
			return true;
		}else {
			return false;
		}
	}
        
	public void memesan_Makanan(String input_nama, int input_stok) {
		for (int i=0;i<id;i++) {
			if (menu[i].getNama_makanan().equals(input_nama)) {
                            menu[i].setStok(menu[i].getStok()-input_stok);
                        }
		}
	}
        
        public void cek_stok(String input_nama){
            for (int i=0;i<id;i++) {
                    if (menu[i].getNama_makanan().equals(input_nama)) {            
                        if(menu[i].getStok() <0){
                        System.out.println("Lu kelaperan? kebanyakan mesennya~!");
                    }            
                }
            }
        }   
	
}
