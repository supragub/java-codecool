package hu.suprasoft.inventory;

/**
 * @author VarGabor
 *
 */

public class PresistentStore extends Store {

	@Override
	public void storeProduct(Product product) {

		getAllProducts().add(product);

	}

}
