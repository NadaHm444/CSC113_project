package project113;

public class TestJewelryStore {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
    
		JewelryStore OurStore= new JewelryStore("Cartier",100);
		
             int ch;
		do{
             System.out.println("**********Cartier store**********");
             System.out.println("welcome to Cartier store customer service , what do you need today?(Enter your menu option)");
             System.out.println("1. Add order for one customer");
             System.out.println("2. Find a customer order");
	    System.out.println("3. Delete a customer order");
	     System.out.println("4. Display a customer order");
	     System.out.println("5. Display today's orderes");
	     System.out.println("6. Exit");
		}while(ch!=6);
    
		
		
	}

}
