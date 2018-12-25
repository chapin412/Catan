package application;

import application.Dice;

public class Debug
{
	
	
	public static void main(String[] args)
	{	
		int[] me = new int[2];
		
		Dice dice = new Dice();
		me = dice.ShakeDice();
		System.out.println(me[0]+" , "+ me[1] + "	合計" + (me[0]+me[1]));
	}

}
