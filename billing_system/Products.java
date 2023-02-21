package billing_system;
import java.util.Iterator;
import java.util.LinkedList;

public class Products {
	private String id;
	private String pname;
	private int qty;
	private double price;
	private double totalPrice;
	private int qty1;
	LinkedList<String> products = new LinkedList<>();
	LinkedList<Double> productprice = new LinkedList<>();
	static LinkedList<Integer> quantity = new LinkedList<>();
	public void setProduct() {
		System.out.println("Items\t\t\tPrice\tQuantity");
		products.add("\n 1.Wafer-Biscuits");
		productprice.add(30.00);
		quantity.add(100);
		products.add("\n 2.Cooking Oil   ");
		productprice.add(120.00);
		quantity.add(50);
		products.add("\n 3.Maggie        ");
		productprice.add(15.00);
		quantity.add(120);
		products.add("\n 4.Chocolates    ");
		productprice.add(50.00);
		quantity.add(100);
		products.add("\n 5.Milk          ");
		productprice.add(62.00);	
		quantity.add(100);
		products.add("\n 6.Protien Powder");
		productprice.add(1800.00);
		quantity.add(50);
		products.add("\n 7.Shampoo       ");
		productprice.add(130.00);
		quantity.add(100);
		products.add("\n 8.Soap          ");
		productprice.add(50.00);
		quantity.add(100);
		products.add("\n 9.Face Mask     ");
		productprice.add(25.00);
		quantity.add(100);
		products.add("\n 10.Cold Drinks      ");
		productprice.add(40.00);
		quantity.add(100);
		
		

	}

	public void displayProducts() {
		
		Iterator<String> itp = products.iterator();      //used for getting the objects
		Iterator<Double> itpr = productprice.iterator();
		Iterator<Integer> itqut = quantity.iterator();
		
		while(itp.hasNext() && itpr.hasNext()){
			System.out.format("%-25s",itp.next());
			System.out.format("%-8s",itpr.next());
			System.out.format("%-8s",itqut.next());
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}

	Products()  {

	}

	Products(String id, String pname, int qty, double price, double totalPrice, int qty1) {
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.qty1 = qty1;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public String getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}

	public int getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int qty1(){ 
		return qty1;
	}
	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nProduct ID \t\tName\t\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}
	
	public void call1()
	{
		Products p = new Products();
		 p = new Products();
         System.out.println(" ");
         System.out.println("List Of the Products:");
         System.out.println(" ");
         p.setProduct();
         p.displayProducts();
         System.out.println(" ");
         System.out.println("You have chosen Incorrect Item: "); 
         System.out.println("--------------------------");  
         System.out.println("Choose a Correct Product: ");
	}

	public void calculatequantity(int number,int quantity){

	
	if (this.quantity.get(number - 1) >= quantity) {
	   
	    this.quantity.add(number - 1, this.quantity.get(number - 1) - quantity);
	} else {
	   
	    System.out.println("Quantity not available.");}
	}
	public void display() {
		System.out.format("   %-9s             %-9s          %5d               %9.2f                       %14.2f\n", id,pname, qty, price, totalPrice);
	}

}
