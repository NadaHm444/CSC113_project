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
	     System.out.println(" Enter your choice is:");
             ch= input.nextInt();
	      System.out.println("your choice is : "+ch);
       switch(ch){
              case 1:
               System.out.println("----------Add order----------");
               System.out.println("Enter customer name:");
               String CustomerName=input.next();
               System.out.println("Enter customer password:");
               String CustomerPassword=input.next();  
               System.out.println("Enter jewelry price :");
               double JewleryPrice=input.nextDouble();
               System.out.println("Enter order id:");
               String OrderId=input.next();
                       if(JewleryPrice >=25000){
			     Customer customerG=new Golden(CustomerName,CustomerPassword,JewleryPrice);
			     Order ord=new Order(OrderId,customerG);
               OurStore.addOrder(ord);  }
		        else 
              if(JewleryPrice<25000){
			     Customer customerS=new Silver(CustomerName,CustomerPassword,JewleryPrice); 
		        Order ord=new Order(OrderId,customerS);
	           OurStore.addOrder(ord);}
                

           
     
               break;
            case 2:
            System.out.println("----------Find order----------");
            System.out.println("Enter order id:");
               String OrderId=input.next();
        Order foundOrder=Order OurStore.searchOrder(OrderId);
		       if(foundOrder != null)
			 System.out.println("Your order is available");
		       else 
		         System.out.println("Your order is not available");
               break;
         
            case 3:
             System.out.println("----------Delete order----------");
            System.out.println("Enter order id first to delete:");
                OrderId=input.next();
              if(OurStore.deleteOrder(OrderId)==true)
		   System.out.println("The deletion was completed successfully");
		       else System.out.println("Cannot delet order with this invalid id")
	       break;

		Case 4:
                System.out.println("----------Display order----------");
            System.out.println("Enter order id first to display:");
                OrderId=input.next();

	       foundOrder=Order OurStore.searchOrder(OrderId);
		       if(foundOrder != null)
			  System.out.println("Display all info for your order:"+foundOrder.toString());

		       else 
		         System.out.println("Your order is not available");
		       

		break;
                 Case 5:
System.out.println("----------Display today's orderes----------");
              OurStore.display();

	       break;

		Case 6:
System.out.println("****Goodbye****");


		break;


       }

			
		}while(ch!=6);
    
		
		
	}

}
