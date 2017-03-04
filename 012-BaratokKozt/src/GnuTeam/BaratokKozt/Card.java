package GnuTeam.BaratokKozt;

public class Card {

	String nev;
	int igazMondas;
	int balhezas;
	int feltekenyseg;
	int roundWinner;

	public Card(String nev, int igazMondas, int balhezas, int feltekenyseg) {
		this.nev = nev;
		this.igazMondas = igazMondas;
		this.balhezas = balhezas;
		this.feltekenyseg = feltekenyseg;

	}

	public Card() {
	}

	public String getNev() {
		return nev;
	}

	public int getIgazMondas() {
		return igazMondas;
	}

	public int getBalhezas() {
		return balhezas;
	}

	public int getFeltekenyseg() {
		return feltekenyseg;
	}

	public void compareIgazMondas(Card card1) {
		if (card1.igazMondas > this.igazMondas) {
			System.out.println(card1.nev + " nyert.");
			roundWinner = 1;
		} else if (card1.igazMondas < this.igazMondas) {
			System.out.println(this.nev + " nyert.");
			roundWinner = 2;
		} else {
			System.out.println("Döntetlen.");
		}
	}

	public void compareBalhezas(Card card1) {
		if (card1.balhezas > this.balhezas) {
			System.out.println(card1.nev + " nyert.");
			roundWinner = 1;
		} else if (card1.balhezas < this.balhezas) {
			System.out.println(this.nev + " nyert.");
			roundWinner = 2;
		} else {
			System.out.println("Döntetlen.");
		}
	}

	public void compareFeltekenyseg(Card card1) {

		if (card1.feltekenyseg > this.feltekenyseg) {
			System.out.println(card1.nev + " nyert.");
			roundWinner = 1;
		} else if (card1.feltekenyseg < this.feltekenyseg) {
			System.out.println(this.nev + " nyert.");
			roundWinner = 2;
		} else {
			System.out.println("Döntetlen");
		}
	}

}
