import java.util.Scanner;
public class TestJewelryStore {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
    
      JewelryStore OurStore =new JewelryStore("Cartier",100);
      
      int ch;//choose
      do{
      
         System.out.println("**********Cartier store**********");
         System.out.println("welcome to Cartier store customer service , what do you need today?(Enter your menu option)");
         System.out.println("1. Add order for one customer");
         System.out.println("2. Find a customer order");
         System.out.println("3. Delete a customer order");
         System.out.println("4. Display a customer order");
         System.out.println("5. Display today's orderes");
         System.out.println("6. Exit");
  
         ch= input.nextInt();
         
          System.out.println("your choice is : "+ ch);
         switch(ch){
            case 1:
               System.out.println("----------Add order----------");
               System.out.println("Enter customer name:");
               String CustomerName=input.next();
               System.out.println("Enter customer id:");
               String CustomerId=input.next();
                System.out.println("Enter order code:");
               String OrderCode=input.next();  
               System.out.println("Enter jewelry price :");
               double JewleryPrice=input.nextDouble();
                             
              if(JewleryPrice >=25000){
			     Customer customerG=new Golden(CustomerName,CustomerId);
			     Order ord=new Order(OrderCode,JewleryPrice,customerG);
               OurStore.addOrder(ord);  }
		        else 
              if(JewleryPrice<25000){
			     Customer customerS=new Silver(CustomerName,CustomerId); 
		        Order ord=new Order(OrderCode,JewleryPrice,customerS);
	           OurStore.addOrder(ord);}
               break;
               
               
            case 2:
             System.out.println("----------Find order----------");
             System.out.println("Enter order code first to find:");
             OrderCode=input.next();
             Order foundOrder=OurStore.searchOrder(OrderCode);
		       if(foundOrder != null)
           System.out.println(" Your order is available");
           else
            System.out.println(" Your order is not  available");
               break;
    
    
            case 3:
              System.out.println("----------Delete order----------");
              System.out.println("Enter order code first to delete :");
              OrderCode=input.next();
              if(OurStore.deleteOrder(OrderCode)==true)
		        System.out.println("The deletion was completed successfully");
		        else 
              System.out.println("Cannot delete order with this invalid id");
	           break;
             
         
            case 4:
            System.out.println("----------Display order----------");
            System.out.println("Enter order code first to Display :");
             OrderCode=input.next();
             foundOrder=OurStore.searchOrder(OrderCode);// copy constructer?!
		       if(foundOrder != null)
            System.out.println("Display all info:\n"+foundOrder.toString());
           else
            System.out.println(" Your order is not available");

               break;
            case 5:
              System.out.println("----------Display today's orderes----------");
              OurStore.display();
      
               break;
            case 6:
            System.out.println("**********Goodbye**********");
               break;
               
            default:
         System.out.println("invalid choice enter from 1-6 :");
         }
      
      }while(ch!=6);
    
   	
   	
   }

}  
      
      
      
