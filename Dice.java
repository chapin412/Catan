package application;

import java.util.Random;

class Dice
{
	private int[] dice;
	
//2つのサイコロの値を返す
int[] ShakeDice()
	{
		 dice[0] = new Random().nextInt(6) + 1;
		 dice[1] = new Random().nextInt(6) + 1;
		 return dice;
	}

}

