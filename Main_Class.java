import java.util.Scanner;
public class Main_Class 
{
public static void main(String[] args) 
{
		Scanner scanner =new Scanner(System.in);
			System.out.println("******************************************************************");
	System.out.println("              WELCOME TO JAVA TUTORIAL ON OOPS CONCEPT");
	System.out.println("******************************************************************");
		Oops op= new Oops();
		Main_Class mainClass=new Main_Class();
		op.oops();
		Concepts c=new Concepts();
		int i=0;
		int mainmenuOption=scanner.nextInt();
		mainmenuOption=mainClass.nextpage(0,mainmenuOption, c);
		while(i!=9) 
		{
			i=scanner.nextInt();
			if(i==1)
			{
				mainmenuOption=mainClass.nextpage(i,mainmenuOption, c);
			}
			else if(i==2)
			{
				mainmenuOption=mainClass.nextpage(i,mainmenuOption, c);
			}
			else if(i!=9)
			{
				System.out.print("please enter a valid Option");
			}
		}
		if(i==9)
		{
			op.oops();
		}
	}

	public int nextpage(int i, int mainOption,Concepts c) {

		if(i==1)
		{
			mainOption=mainOption-1;
		}else if(i==2)
		{
			mainOption=mainOption+1;
		}
		if(mainOption==0)
		{
			System.out.print("Invalid Tries");
			mainOption=1;
		}else if(!(mainOption<8)){
			System.out.println("Invalid Tries");
			mainOption=6;
		}
		switch (mainOption) 
		{
		case 1:
			c.oop_class();
			System.out.println("Next page press 2");
			return mainOption;
		case 2:
			c.oop_object();
			System.out.println("Previous page press-> 1| main page press-> 9|next page 			press -> 2");
			return mainOption;
		case 3:
			c.oop_Inheritance();
			System.out.println("Previous page press-> 1| main page press-> 9|next page 			press -> 2");
			return mainOption;
		case 4:
			c.oop_Polymorphism();
			System.out.println("Previous page press-> 1| main page press-> 9|next page 			press -> 2");
			return mainOption;
		case 5:
			c.oop_Abstract();
			System.out.println("Previous page press-> 1| main page press-> 9|next page 			press -> 2");
			return mainOption;
		case 6:
			c.oop_Encapsulation();
			System.out.println("Previous page press-> 1| main page press-> 9|next page 			press -> 2");
			return mainOption;
		case 7:
			c.oop_Interface();
			System.out.println("Previous page press-> 1| main page press-> 9");
			return mainOption;
		}
		return mainOption;
	}



}
