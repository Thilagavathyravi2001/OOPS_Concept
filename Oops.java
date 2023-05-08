import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.Scanner;
public class Oops {
	Scanner scanner =new Scanner(System.in);
	public void oops()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("		   Object Oriented Programming	 ");
		System.out.println("--------------------------------------------------------");

		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\W_oops.txt");
		try {
			FileReader read = new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
			System.out.println(st);
			System.out.println(" Class	      ----------------------Press 1");        
			System.out.println(" Object 	      ----------------------Press 2"); 
			System.out.println(" Inheritance      ----------------------Press 3");
			System.out.println(" Polymorphism     ----------------------Press 4");
			System.out.println(" Abstraction      ----------------------Press 5");
			System.out.println(" encapsulation    ----------------------Press 6");         
			System.out.println(" Interface        ----------------------Press 7");            	System.out.println("------------------------------------------------------------------");
	System.out.println("Enter the Option----->");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













}
