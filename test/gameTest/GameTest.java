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
		roll(20,0);
		assertEquals(0,game.score());
	}
	
	
	@Test
	void test20Roll1 () {
		roll(20,1);
		assertEquals(20,game.score());
	}
	
	@Test
	void test10Roll1And10Roll2 () {	
		roll(10,1);
		roll(10,2);
		assertEquals(30,game.score());
	}
	
	@Test
	void testspare () {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		roll(17,0);
		assertEquals(18,game.score());
	}
	
	private void roll(int nbRoll, int quilleTombe) {
		for (int i=0;i<nbRoll;i++)
			game.roll(quilleTombe);
	}

}
