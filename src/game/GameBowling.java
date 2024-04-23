package game;

public class GameBowling {

	static int NB_MAX_TOURS = 21;
	private int roll = 0;
	private boolean spare = false;
	int[] tours = new int[NB_MAX_TOURS];

	public void roll(int nbQuilles) {
		tours[roll++] = nbQuilles;
	}

	public int score() {
		int score = 0;
		int position = 0;
		for (int i = 0; i < 10; i++) {
			if (tours[position ] + tours[position + 1] == 10) {
				score +=  tours[position] + tours[position + 1]+tours[position+2];
			} else {
				score += tours[position] + tours[position + 1];
			}
			position += 2;
		}
		return score;
	}

}
