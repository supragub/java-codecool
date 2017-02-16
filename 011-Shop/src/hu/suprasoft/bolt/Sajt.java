package hu.suprasoft.bolt;

import java.util.Date;

/**
 * @author VarGabor
 *
 */

public class Sajt {

	double suly;
	double zsirtartalom;
	Long vonalKod;
	String gyarto;
	Date szavatossagiIdo;

	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {

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

	public boolean joMeg() {
		Date today = new Date();
		return today.before(szavatossagiIdo);
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public Long getVonalKod() {
		return vonalKod;
	}

	public String getGyarto() {
		return gyarto;
	}
}
