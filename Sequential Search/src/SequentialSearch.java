import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class SequentialSearch
	{
		
		static int counter = 0;
		public static void main(String[] args) throws IOException
			{
				//this grabs the text file that i had inserted before
				Scanner myFile = new Scanner(new File("TextFile.txt"));
				
				//as the loop goes through each line
				//hasNext is scanner object and grabs the next token
				while(myFile.hasNext())
					{
						//establishes the letter as the next one and continues
						String letter = myFile.next();
						
						if(letter.equals("v"))
							{
								System.out.println("i found the v");
								System.out.println("It is " + counter);
							}
						counter++;
					}
				
			}

	}
