package hu.suprasoft.bolt;

import java.util.Date;

/**
 * @author VarGabor
 *
 */

public class Tej {

	private int urtartalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;
	private long vonalKod;

	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	private final double ZSIROS = 3.5;
	private final double FELZSIROS = 2.8;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {

		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public long getVonalKod() {
		return vonalKod;
	}

	public boolean joMeg() {
		Date today = new Date();
		return today.before(szavatossagiIdo);
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtaltalom() {
		return zsirtartalom;
	}

	public long getAr() {
		return getAr();
	}

	@Override
	public String toString() {
		return "Űrtartalom: " + getUrtartalom() + "\nGyártó: " + getGyarto() + "\nSzavatossági idő: "
				+ getSzavatossagiIdo() + "\nZsírtartalom: " + getZsirtaltalom() + "\nÁr: " + getAr();
	}
}
