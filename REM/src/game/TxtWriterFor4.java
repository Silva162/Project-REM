package game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TxtWriterFor4 {
	public static void main(String[] args)
	{
		int score = 60;
		int age = 15;
		
		try
		{
	
			InputStream myInput = new FileInputStream("data4x4.txt");
			Scanner myInputFile = new Scanner(myInput);
			
			List<ArrayList<Integer>> namesAndNumbers = new ArrayList<ArrayList<Integer>>();
			
			namesAndNumbers.add(new ArrayList<Integer>(Arrays.asList(age, score)));
									
			while(myInputFile.hasNext())
			{
				age = myInputFile.nextInt();
				score = myInputFile.nextInt();
				namesAndNumbers.add(new ArrayList<Integer>(Arrays.asList(age, score)));		
			}
			
			
			Collections.sort(namesAndNumbers, new Comparator<ArrayList<Integer>>() {    
			        @Override
			        public int compare(ArrayList<Integer> age1, ArrayList<Integer> age2) {
			            return age1.get(0).compareTo(age2.get(0));
			        }               
			});
			
			myInputFile.close();
			 
			
			OutputStream myFile = new FileOutputStream("data4x4.txt");
			PrintStream myOutputFile = new PrintStream(myFile);
			
			for(int x = 0; x < namesAndNumbers.size(); x++){
				myOutputFile.println(namesAndNumbers.get(x).get(0) + " " + namesAndNumbers.get(x).get(1));
			}
			
			
			myFile.close();
		}
		
		catch (Exception E)
		{
			System.out.println("Cannot save data for 4x4 game to txt");
		}
		
	}
}
