package com.bridgelabz.OOPS;

public class DeckofCards {
	
	public static void main(String[] args)
	{
		String Suit[ ] = {"Clubs","Diamonds","Hearts","Spades"};
		String Rank[ ] = {"Ace","2", "3", "4","5","6","7","8","9","10","Jack","Queen","King"};
		String [][] Cards = new String[4][13];
		
		for(int i = 0; i < Suit.length; i++)
		{
			for(int j = 0; j < Rank.length; j++)
			{
				Cards[i][j] = Suit[i]+" "+Rank[j]+" ";
					
			}
			
		}
		
		for(int i = 0; i < Suit.length; i++)
		{
			for(int j = 0; j < Rank.length; j++)
			{			
				System.out.print("Cards = "+Cards[i][j]);							
			}
			System.out.println();
		}
		
		for(int i = 0; i < Cards.length; i++)
		{
			for(int j = 0; j < Cards[i].length; j++)
			{
				int i1 = (int) (Math.random() * Cards.length);
				int j1 = (int) (Math.random() * Cards[i].length);
				
				String temp = Cards[i][j];
				Cards[i][j] = Cards[i1][j1];
				Cards[i1][j1] = temp;
			}
			
		}
		for(int i = 0; i < Cards.length; i++)
		{
			for(int j = 0; j < Cards[i].length; j++)
			{
				
				System.out.print("new Cards[i][j] = "+Cards[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Cards for Person "+ (i+1) + " is ");
			for (int j = 0 ; j < 9; j++)
			{
				System.out.println(Cards[i][j]);
			}
			System.out.println();
		}
	}

}
