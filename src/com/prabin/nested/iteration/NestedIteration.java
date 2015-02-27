package com.prabin.nested.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Suit {
	CLUB, DIAMOND, HEART, SPADE
}

enum Rank {
	ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card {
	final Suit suit;
	final Rank rank;
	
	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

public class NestedIteration {

	public static void main(String... args) {
		List<Suit> suits = Arrays.asList(Suit.values());
		List<Rank> ranks = Arrays.asList(Rank.values());
		
		List<Card> deck = new ArrayList<Card>();
		for(Suit suit : suits) {
			for(Rank rank : ranks) {
				deck.add(new Card(suit, rank));
			}
		}
		
		for(int i = 0; i < suits.size(); i++) {
			for(int j = 0; j < ranks.size(); j++) {
				System.out.println("suit = " + suits.get(i) + " rank= " + ranks.get(j));
			}
		}
		
		
	}
}
