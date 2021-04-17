import java.util.Scanner;

public class Ball {
	
	String Brand, Color, sportType, Material, Size;
	double price, Totalprice;
	int weight, Quantity;
	
	Scanner sc = new Scanner(System.in);
	//default constructor 
	Ball() {
		System.out.println("Enter the Brand : ");
		this.Brand=sc.nextLine();
		
		System.out.println("Enter the Color : ");
		this.Color=sc.nextLine();
		
		System.out.println("Enter the sportType : ");
		this.sportType=sc.nextLine();
		
		System.out.println("Enter the Material : ");
		this.Material=sc.nextLine();
		
		System.out.println("Enter the Size : ");
		this.Size=sc.nextLine();
		
		System.out.println("Enter the price : RM ");
		this.price=sc.nextDouble();
		
		System.out.println("Enter the Quantity : ");
		this.Quantity=sc.nextInt();
		
		System.out.println("Enter the weight : ");
		this.weight=sc.nextInt();
		
		System.out.println("The total price : RM ");
		this.Totalprice = this.price * this.Quantity;		
	}
	//parameterized constructor
	Ball(String Brand, String Color, String sportType, String Material, String Size, double price, double Totalprice, int weight, int Quantity){
    
	this.Brand=Brand;
	this.Color=Color;
	this.Material=Material;
	this.sportType=sportType;
	this.Size=Size;
	this.price=price;
	this.Quantity=Quantity;
	this.weight=weight;
	this.Totalprice=Totalprice;
	}
}
	
