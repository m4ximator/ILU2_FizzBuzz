package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import game.GameBowling;

class GameTest {
	GameBowling game;
	
	@BeforeEach
	void init() {
	game= new GameBowling();
	}
	
	@Test
	void test0RollEntreeVide () {
		assertEquals(0,game.score());
	}
	
	@Test
	void test20Roll0 () {
		for (int i=0;i<20;i++)
			game.roll(0);
		assertEquals(0,game.score());
	}
	
	
	@Test
	void test20Roll1 () {
		
		for (int i=0;i<20;i++)
			game.roll(1);
		assertEquals(20,game.score());
	}
	
	@Test
	void test10Roll1And10Roll2 () {
		for (int i=0;i<20;i++) {
			if(i<10)
				game.roll(1);
			else
				game.roll(2);
		}
		assertEquals(30,game.score());
	}

}
