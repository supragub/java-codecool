package hu.suprasoft.bolt;

import java.util.Date;

/**
 * @author VarGabor
 *
 */

public abstract class Tej extends Elelmiszer {

	protected int urtartalom;
	protected double zsirtartalom;

	public final int LITER = 10;
	public final int FELLITER = 5;
	public final int POHAR = 2;
	public final double ZSIROS = 3.5;
	public final double FELZSIROS = 2.8;

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {

		super(vonalKod, gyarto, szavatossagiIdo);
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
	}

	@Override
	public Long getVonalKod() {
		return vonalKod;
	}

	@Override
	public boolean joMeg() {
		Date today = new Date();
		return today.before(szavatossagiIdo);
	}

	public int getUrtartalom() {
		return urtartalom;
	}

	@Override
	public String getGyarto() {
		return gyarto;
	}

	@Override
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
