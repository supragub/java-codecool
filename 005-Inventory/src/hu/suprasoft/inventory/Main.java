package hu.suprasoft.inventory;

/**
 * @author VarGabor
 *
 */

public class Main {
	public static void main(String[] args) {
		StorageManager store = new StorageManager();
		StoreCapable capable = new PresistentStore();
		store.addStorage(capable);
		store.addCDProduct("Best of Megamix", 500, 120);
		store.addBookProduct("Verne Gyula: Grant kapitány gyermekei", 3000, 846);
		System.out.println(store.listProducts());
		System.out.println(store.getTotalProductPrice());

	}

}
