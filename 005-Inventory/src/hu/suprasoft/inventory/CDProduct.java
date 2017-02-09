package hu.suprasoft.inventory;

/**
 * @author VarGabor
 *
 */

public class CDProduct extends Product {
	int numOfTracks;

	public CDProduct(String name, Integer price, int numOfTracks) {
		super(name, price);
		this.numOfTracks = numOfTracks;
	}

}