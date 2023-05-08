import java.util.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.Scanner;
public class Concepts {
	Scanner scanner =new Scanner(System.in);
	public void oop_class(){
	File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\class.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		
		}catch(Exception e) {
			// TODO: handle exception
		}
	}
	public void oop_object(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\object.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		

		}catch(Exception e) {
			// TODO: handle exception
		}
	}
	public void oop_Encapsulation(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\Encapsulation.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		

		}catch(Exception e) {
			// TODO: handle exception
		}
	}
	public void oop_Polymorphism(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\Polymorphism.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		

		}catch(Exception e) {
			// TODO: handle exception
		}}
	public void oop_Abstract(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\Abstraction.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		

		}catch(Exception e) {
			// TODO: handle exception
		}}
	public void oop_Interface(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\Interface.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);		

		}catch(Exception e) {
			// TODO: handle exception
		}}
	public void oop_Inheritance(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\Inheritance.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);	
		System.out.println("----------------------------------->(press 1 to   seemore)");
			int  ans=scanner.nextInt();
			if(ans==1) {
				oop_threelevels();
			}
		}catch(Exception e) {
			// TODO: handle exception
		}}
	public void oop_threelevels(){
		File file=new File("C:\\Users\\ELCOT\\Desktop\\java\\threelevels.txt");
		try {
			FileReader read=new FileReader(file);
			BufferedReader	br = new BufferedReader(read);
			String st;
			while((st=br.readLine())!=null)
				System.out.println(st);	

		}catch(Exception e) {
			// TODO: handle exception
		}}
}