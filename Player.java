package application;

public class Player {

	String player_name;
	//[0]: Tree, [1]:Bricks, [2]:Wheat, [3]:Sheep, [4]:,Iron
	int[] rescardnum = new int[5];
	//[0]: Night, [1]:Point, [2]:Discover, [3]:Monopoly, [4]:Constract
	int[] devcardnum = new int [5];
	//count騎士力
	int knightnum;
	//count街道数
	int roadnum;
	//勝利点
	int victorypoint;
	
Player() {
		player_name = "Player";
		for(int i=0; i<5; i++) {
			rescardnum[i] = 0;
			devcardnum[i] = 0;
		}
		knightnum = 0;
		roadnum = 0;
		victorypoint = 0;
		
	}
	void setPlayerName() {
		player_name = "";
	}
	
}
