package GnuTeam.BaratokKozt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hand {

	int myCounter = 0;
	int AICounter = 0;

	ArrayList<Card> cardsInHand = new ArrayList<Card>();
	ArrayList<Card> aiCards = new ArrayList<Card>();

	public void getCards(ArrayList<Card> cardList) {
		Random random = new Random();
		int counter = 1;
		while (counter <= 16) {
			int rand = random.nextInt(cardList.size());
			Card randomCard = cardList.get(rand);
			if (!cardsInHand.contains(randomCard)) {
				cardsInHand.add(randomCard);
				counter++;
			}
		}
	}

	public void getAICards(ArrayList<Card> cardList) {
		int counter = 1;
		while (counter <= 16) {
			for (Card card : cardList) {
				if (!cardsInHand.contains(card)) {
					aiCards.add(card);
					counter++;
				}
			}
		}
	}

	public void printIn(ArrayList<Card> cList) {
		for (Card c : cList) {
			System.out.println(c.nev);
		}
	}

	public Card showCard(ArrayList<Card> cList, int i) {
		System.out.println(cList.get(i).nev + "\nIgazmondás: " + cList.get(i).igazMondas + "\nBalhézás: "
				+ cList.get(i).balhezas + "\nFéltékenység: " + cList.get(i).feltekenyseg);
		return cList.get(i);
	}

	public int chooseSkill() {
		Scanner input = new Scanner(System.in);
		System.out.println("Válassz egy tulajdonságot. (Igazmondás: 1; Balhézás: 2; Féltékenység: 3)");
		int inp = 0;
		while (inp > 3 || inp < 1) {
			inp = input.nextInt();
			if (inp > 3 || inp < 1) {
				System.err.println("1-3 közötti számot adj meg!!!");
			}

		}
		return inp;
	}

	public int showWinner(int inp, int i) {

		if (inp == 1) {
			Card card = cardsInHand.get(i);
			card.compareIgazMondas(aiCards.get(i));
			if (cardsInHand.get(i).roundWinner == 2) {
				myCounter++;
			} else if (cardsInHand.get(i).roundWinner == 1) {
				AICounter++;
			}
			return cardsInHand.get(i).igazMondas;
		} else if (inp == 2) {
			Card card = cardsInHand.get(i);
			card.compareBalhezas(aiCards.get(i));
			if (cardsInHand.get(i).roundWinner == 2) {
				myCounter++;
			} else if (cardsInHand.get(i).roundWinner == 1) {
				AICounter++;
			}
			return cardsInHand.get(i).balhezas;
		} else if (inp == 3) {
			Card card = cardsInHand.get(i);
			card.compareFeltekenyseg(aiCards.get(i));
			if (cardsInHand.get(i).roundWinner == 2) {
				myCounter++;
			} else if (cardsInHand.get(i).roundWinner == 1) {
				AICounter++;
			}
			return cardsInHand.get(i).feltekenyseg;
		}
		return 1;
	}

}
