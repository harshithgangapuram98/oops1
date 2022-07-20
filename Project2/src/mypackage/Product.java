package mypackage;
import java.util.Scanner;

public class Product {

	    public int id;
		public String name;
		public int price;
		
		public static String company = "happi mobiles";
		
		public static void printCompany()
		{
			System.out.println("company");
			
		}
		
		public Product() 
		{
			id=0;
			name=null;
			price=0;
			
		}
		
		
		public Product (int id, String name, int price)
		{
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
		public void readData()
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter id: ");
			id = Integer.parseInt(obj.nextLine());
			System.out.println("Enter product name: ");
			name = obj.next();
			System.out.println("Enter product price: ");
			id = Integer.parseInt(obj.nextLine());
		}
		
		public void printData()
		{
			System.out.println("Id : "+id);
			System.out.println("name : "+name);
			System.out.println("price : "+price);
			System.out.println("Company : "+company);
		}

			

		
		
		

	}


