package billing_system;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Products p = new Products();

          String id = null;  
          String productName = null; 
          int i=0;
          int quantity = 0;  
          int qty=0;
          double price = 0.0;  
          double totalPrice = 0.0;  
          double overAllPrice = 0.0;  
          double cgst, sgst, subtotal=0.0, discount=0.0;  
          char choice = '\0';  
          System.out.println("\t\t\t\t|-------------------Invoice-----------------|");  
          System.out.println(" \t\t\t\t|\t "+"     "+"     Online Market            |");  
          
          System.out.println("\t\t\t\t|-------------------------------------------|");  
          System.out.println(" GSTIN: 06WAFG098FS2344"+"\t\t\t\t\t\t\tContact: (+91) 9028201626");  
          
          
          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
          Date date = new Date();    
          
          
          Calendar calendar = Calendar.getInstance();  
          String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; 
          
          
       
          System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]+"\t\t\t\t\t\t (+91) 9234985533");  
         
          System.out.println("-------------------------------------------------------------------------------------------------------------");
          System.out.println("-------------------------------------------------------------------------------------------------------------");
          Scanner scan = new Scanner(System.in);  
          System.out.print("Enter Customer Name: ");  
          String customername=scan.nextLine();  
         
          ArrayList<Products> product = new ArrayList<Products>();  
          do   
              {  
                   p = new Products();
                  System.out.println(" ");
                  System.out.println("List Of the Products:");
                  System.out.println(" ");
                  p.setProduct();
                  p.displayProducts();
              
                  System.out.println(" ");
                  System.out.println("Enter the product details ");  
                  System.out.println("--------------------------");  

                  System.out.println("Choose a Product: ");

                  i=scan.nextInt();
                  while(i>10)
                  {
                  	p.call1();
                      i=scan.nextInt();
                  }
                  if (i<11)
                  {
                      System.out.print("Quantity: ");  
                      quantity = scan.nextInt();
                  
//                  System.out.print("Quantity: ");  
//                  quantity = scan.nextInt();  
                 
                  
                  switch (i) {
					case 1:
						id="101";
						productName="Wafer-Biscuits";
						price=30;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
					case 2:
						id="102";
						productName="Cooking Oil";
						price=120;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 3:
						id="103";
						productName="Maggie";
						price=15;
						qty = 120;
						totalPrice = price * quantity;  
						break;
						
					case 4:
						id="104";
						productName="Chocolates";
						price=50;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
					case 5:
						id="105";
						productName="Milk";
						price=62;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
					case 6:
						id="106";
						productName="Protien Powder";
						price=1800;
						qty = 50;
						totalPrice = price * quantity;  
						break;
						
					case 7:
						id="107";
						productName="Shampoo";
						price=130;
						qty = 100;
						totalPrice = price * quantity;  
						break;
					
					case 8:
						id="108";
						productName="Soap";
						price=50;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
					case 9:
						id="109";
						productName="Face Mask";
						price=25;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
					case 10:
						id="110";
						productName="Cold Drink";
						price=40;
						qty = 100;
						totalPrice = price * quantity;  
						break;
						
						
					default:
						
						break;
                  }	
					}
                 Products pod = new Products();
                 pod.calculatequantity(i, quantity);
                  

                  
                  overAllPrice = overAllPrice + totalPrice;  
                 
                  product.add( new Products(id, productName, quantity, price, totalPrice, qty) );  
                  
                  System.out.print("Want to add more items? (y or n): ");  
                 
                  choice = scan.next().charAt(0);  
                    
                  scan.nextLine();  
              }   
          while (choice == 'y' || choice == 'Y');  
           
          Products.displayFormat();  
          for (Products po : product)   
          {  
              po.display();  
          }  
           
          System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice);  
          
          discount = overAllPrice*2/100;  
          System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t  Discount (Rs.) " +discount);  
           
          subtotal = overAllPrice-discount;   
          System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal);  
          
          sgst=overAllPrice*8/100;  
          System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst);  
          cgst=overAllPrice*8/100;  
          System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst);  
          
          System.out.format("%2s","\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst));  
          System.out.println("");
          System.out.println("--------------------------------------------------Thank You for Shopping!!---------------------------------------------------------");  
          System.out.println("\t\t\t\t                     Visit Again");  
           
          System.out.println("");
          
          do{
          	 System.out.print("If you Want to See Remaining Quantity (y/n)");
               choice = scan.next().charAt(0);  
               
               scan.nextLine(); 
          	switch(choice){
          	case 'y': Products pod = new Products();
          
          	p.displayProducts();
          	break;
          	default: System.out.println("Thankyou For Shopping");
          	}
          }
          while (choice == 'y' || choice == 'Y'); 
          choice = scan.next().charAt(0);  
          
          scan.nextLine();  
          
          scan.close();  
	}

}
