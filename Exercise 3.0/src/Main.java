
public class Main {

	public static void main(String[] args) {
		//Default Constructor
		Ball Golf = new Ball();
		
		System.out.println("Brand: " + Golf.Brand);
		System.out.println("Color: " + Golf.Color);
		System.out.println("Sport Type: " + Golf.sportType);
		System.out.println("Material: " + Golf.Material);
		System.out.println("Size : " + Golf.Size);
		System.out.println("Price: RM " + Golf.price);
		System.out.println("Quantity: " + Golf.Quantity);
		System.out.println("Weight: " + Golf.weight + "g");
		System.out.println("Total price: RM " + Golf.Totalprice);
		System.out.println();
		
		//Parameterized Constructor
		Ball Soft = new Ball("Mizuno 150", "Yellow", "Soft Ball", "Synthetic Leather", "Small", 20, 40, 198, 2 );
		
		System.out.println("Brand: " + Soft.Brand);
		System.out.println("Color: " + Soft.Color);
		System.out.println("Sport Type: " + Soft.sportType);
		System.out.println("Material: " + Soft.Material);
		System.out.println("Size : " + Soft.Size);
		System.out.println("Price: RM " + Soft.price);
		System.out.println("Quantity: " + Soft.Quantity);
		System.out.println("Weight: " + Soft.weight + "g");
		System.out.println("Total price: RM " + Soft.Totalprice);
		System.out.println();
		
	}

}
