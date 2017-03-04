
package GnuTeam.BaratokKozt;

import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("");
		LoadData logo = new LoadData();
		logo.loadFile("baratok-kozt-logo.txt");
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indításhoz nyomjon ENTER billentyűt.");
		String enter = scanner.nextLine();
		System.out.println("Pakli megkeverése...");
		Thread.sleep(2500);
		System.out.println("Lapok szétosztása...");
		Thread.sleep(3000);
		System.out.println("Sok szerencsét!");
		Thread.sleep(1500);
		System.out.println("-----------------");
		Deck deck = new Deck();

		deck.cardList.add(new Card("Berényi András", 9, 3, 1));
		deck.cardList.add(new Card("Berényi Miklós", 1, 9, 7));
		deck.cardList.add(new Card("Szentmihályi Zsófia", 6, 2, 7));
		deck.cardList.add(new Card("Berényi Attila", 3, 8, 5));
		deck.cardList.add(new Card("Kertész Géza", 3, 3, 5));
		deck.cardList.add(new Card("Kertész Vilmos", 8, 4, 3));
		deck.cardList.add(new Card("Magdi Anyus", 10, 10, 9));
		deck.cardList.add(new Card("Magdi Anyus szelleme", 10, 10, 10));
		deck.cardList.add(new Card("Bartha Zsolt", 1, 6, 6));
		deck.cardList.add(new Card("Holmann Hanna", 4, 6, 3));
		deck.cardList.add(new Card("Bartha Krisztián", 9, 6, 4));
		deck.cardList.add(new Card("Berényi Claudia", 4, 7, 9));
		deck.cardList.add(new Card("Egressy \"Tóni\" Antal", 2, 9, 6));
		deck.cardList.add(new Card("Nádor Kinga", 5, 6, 7));
		deck.cardList.add(new Card("Balogh Nóra", 6, 6, 6));
		deck.cardList.add(new Card("Berényi Zsuzsa", 7, 6, 8));
		deck.cardList.add(new Card("Berényi Kata", 5, 2, 5));
		deck.cardList.add(new Card("Berényi Dániel", 3, 6, 1));
		deck.cardList.add(new Card("Nagy Tóbiás & (F)Asztalos Kristóf", 7, 7, 6));
		deck.cardList.add(new Card("Illés Vanda", 2, 6, 8));
		deck.cardList.add(new Card("Illés Péter", 1, 10, 7));
		deck.cardList.add(new Card("Illés Júlia", 6, 7, 10));
		deck.cardList.add(new Card("Bokros Gizi", 3, 5, 8));
		deck.cardList.add(new Card("Bartha Linda", 4, 7, 6));
		deck.cardList.add(new Card("Bokros Ádám", 7, 8, 6));
		deck.cardList.add(new Card("Fekete Alíz", 2, 6, 8));
		deck.cardList.add(new Card("Fekete Luca", 10, 3, 5));
		deck.cardList.add(new Card("Cheng", 6, 7, 6));
		deck.cardList.add(new Card("Berci", 10, 9, 9));
		deck.cardList.add(new Card("Berényi Balázs", 3, 8, 7));
		deck.cardList.add(new Card("A pincér", 1, 1, 1));
		deck.cardList.add(new Card("Novák László", 6, 8, 3));
		Hand hand = new Hand();
		Card card = new Card();
		hand.getCards(deck.cardList);
		hand.getAICards(deck.cardList);
		for (int i = 0; i <= hand.cardsInHand.size() - 1; i++) {
			System.out.println(i + 1 + ". kör.");
			Card myCard = hand.showCard(hand.cardsInHand, i);
			System.out.println("");
			int inp = hand.chooseSkill();
			System.out.println("Ellenfél lapja:");
			System.out.println("");
			Thread.sleep(1250);
			Card AICard = hand.showCard(hand.aiCards, i);
			Thread.sleep(1000);
			hand.showWinner(inp, i);
			System.out.println("Nyert körök: " + hand.myCounter + ".");
			System.out.println("Gép által nyert körök: " + hand.AICounter + ".");
			System.out.println("-------------------");
			Thread.sleep(3000);
		}
		if(hand.myCounter > hand.AICounter){
			logo.loadFile("nyertel-logo.txt");
		}
		else if (hand.myCounter == hand.AICounter){
			logo.loadFile("dontetlen-logo.txt");
		}
		else if (hand.myCounter < hand.AICounter){
			logo.loadFile("vesztettel-logo.txt");
		}
		System.out.println("Köszönjük a játékot!");
		logo.loadFile("super-gnu.txt");

	}

}
