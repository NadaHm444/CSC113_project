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
                       if(JewleryPrice >25000){
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
        Order foundOrder=OurStore.searchOrder(OrderId);
		       if(foundOrder != null)
			 System.out.println("      
		       
               break;
         
            case 3:


	       break;

		Case 2:


		break;
                Case 3:

	       break;

		Case 4:


		break;
                 Case 5:

	       break;

		Case 6:


		break;


       }

			
		}while(ch!=6);
    
		
		
	}

}
