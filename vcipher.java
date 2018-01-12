package Vigenere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vcipher 
{
	
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter plain txt to encrypt: ");
		String strCode = scan.next();
		char[] codeArray = strCode.toCharArray();//row
		System.out.print("Enter encryption key: ");
		String strKey = scan.next();
		char[] keyArray = strKey.toCharArray();//column 
				
		char[][] board = new char[26][26];
		for(int i = 0; i<board.length; i++)
		{
			for(int j = 0; j< board.length; j++)
			{
				board[i][j]= (char)(97+((i+j)%26));
			}
		}
		
		int column=0,row=0;
		for (int i = 0; i < strKey.length(); i++) 
		{	    
	        	column = (int)keyArray[i];
	        	row = (int)codeArray[i];       	
	        	System.out.print(board[column-97][row-97]);
	    }
		
		System.out.print("\nEnter txt to decrypt: ");
		String dString = scan.next();
		String strKeyy = strKey;
		char[] codeArray2 = dString.toCharArray();//row
		char[] keyArray2 = strKeyy.toCharArray();//column
		column=0;row=0;
		for (int i = 0; i < dString.length(); i++) 
		{	
			column = ((int)keyArray2[i])%26;
			row = ((int)codeArray2[i])%26;
			int x = (row-column)+97;
			if(x>96)
			{
				System.out.print((char)(x));
			}
			else
			{
				System.out.print((char)(x+26));
			}					
		}
		
	}
}
