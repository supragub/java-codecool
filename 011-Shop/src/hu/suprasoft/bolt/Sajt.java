package hu.suprasoft.bolt;

import java.util.Date;

/**
 * @author VarGabor
 *
 */

public class Sajt extends Elelmiszer {

	double suly;
	double zsirtartalom;

	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {

		super(vonalKod, gyarto, szavatossagiIdo);
		this.vonalKod = vonalKod;
		this.suly = suly;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return "Súly: " + getSuly() + "\nGyártó: " + getGyarto() + "\nSzavatossági idő: " + getSzavatossagiIdo()
				+ "\nZsírtartalom: " + getZsirtartalom();
	}

	@Override
	public boolean joMeg() {
		Date today = new Date();
		return today.before(szavatossagiIdo);
	}

	@Override
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	@Override
	public Long getVonalKod() {
		return vonalKod;
	}

	@Override
	public String getGyarto() {
		return gyarto;
	}
}
