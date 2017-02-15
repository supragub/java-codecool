package hu.suprasoft.bolt;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author VarGabor
 *
 */

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable<Tej, Integer> tejpult;
	private int flag;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable<Tej, Integer> tejpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	public boolean vanMegTej() {
		return (tejpult.size() > 0);
	}

	public Tej vasarolTej(long vonalKod) {
		for (Map.Entry<Tej, Integer> tejtermek : tejpult.entrySet()) {
			if (tejtermek.getKey().getVonalKod() == vonalKod) {
				tejpult.put(tejtermek.getKey(), tejtermek.getValue() - 1);
				return tejtermek.getKey();
			}
		}
		return null;
	}

	public void feltoltTej(Tej m) {
		if (tejpult.contains(m)) {
			Integer value = tejpult.get(m);
			tejpult.put(m, ++value);
		} else {
			tejpult.put(m, 1);
		}
	}
}
