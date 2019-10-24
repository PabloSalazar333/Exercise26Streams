package com.exercise26streams.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;;


public class WriterApp 
{

	public static void main(String[] args) 
	{
		// Constant declaration
		final int LIMIT = 24;
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		
		Scanner input = new Scanner(System.in);
		int table=0;
		
		
		try {
			myFile = new File("C:\\a\\b.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			
			System.out.print("Input the multiplication table: ");
			table = input.nextInt();
			for(int i=1; i<=LIMIT; i++)
			{
				System.out.print(String.format("%d X %d = %d \n", table,i,table*i));
				myBuffer.write(String.format("%d X %d = %d \n", table,i,table*i));//+String.format("%d X %d = %d \n", table,i,table*i));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
