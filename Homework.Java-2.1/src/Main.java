import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;

public class Main {
	
	 static void write()
	{
		try 
		{
     FileWriter file = new FileWriter("fisier.txt");
     file.write("#F3AA34");
     file.append('\n');
     file.write("23");
     file.close();
		}
		
		catch(IOException exception)
		{
		System.out.println("File operation error occured.");
		exception.getStackTrace();
		}

     System.out.println("Succesfully wrote to the file.");
	
	}
	 
	 public static void read() throws NoSuchElementException, FileNotFoundException
	 {
		
		 File myfile = new File("fisier.txt");
	     Scanner scanner = new Scanner(myfile);
				
		while(scanner.hasNextLine())
				{
			       Config.getConfigInstance().setColor(scanner.next());
			       Config.getConfigInstance().setWeight(scanner.next());
				}
		
		scanner.close();
			
	 }
	 
	
	public static void main(String[] args) 
	{
     	try
	    {
		write();
		read();
	    }
		
		 catch(FileNotFoundException exp)
		{
			System.out.println("File not found");
		}
			
	    catch(NoSuchElementException e)
		{
			System.out.println("Error occured");
			e.printStackTrace();
		}
		
     	
		System.out.println("Configuration successfully done.");
		System.out.println("Config color is " + Config.getColor() + ".");
		System.out.println("Config weight is " + Config.getWeight() + ".");
		
	}
 	
}
	
	
	