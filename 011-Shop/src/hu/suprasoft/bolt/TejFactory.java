package hu.suprasoft.bolt;

import java.util.Date;

/**
 * @author VarGabor
 *
 */
public abstract class TejFactory {

	public abstract Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom, long ar);

	public abstract Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom, long ar);
}
