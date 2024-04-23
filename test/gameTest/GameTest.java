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
		game.rolls(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		assertEquals(0,game.score());
	}
	
	
	@Test
	void test20Roll1 () {
		game.rolls(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
		assertEquals(20,game.score());
	}
	
	@Test
	void test10Roll1And10Roll2 () {	
		game.rolls(1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2);
		assertEquals(30,game.score());
	}
	
	@Test
	void testspare () {
		game.rolls(7,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		assertEquals(18,game.score());
	}
	
	@Test
	void teststrike () {
		game.rolls(10,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		assertEquals(24 ,game.score());
	}
	
	@Test
	void testCasGeneral () {
		game.rolls(1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 7);

		assertEquals(122, game.score());
	}
	
	@Test
	void testExtension () {
		game.rolls(1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 8, 8);
		assertEquals(131,game.score());
	}
	
	@Test
	void testgenie () {
		game.rolls(10,10,10,10,10,10,10,10,10,10,10,10);
		assertEquals(300,game.score());
	}
	
	



}
