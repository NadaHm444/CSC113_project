import java.util.Scanner;
public class TestJewelryStore {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
    
      JewelryStore OurStore =new JewelryStore("Cartier",100);
      
      int ch;//choise for the menu
      do{// the menu appears continuously as long as he does not choose to exit
      
         System.out.println("**********Cartier store**********");
         System.out.println("welcome to Cartier store customer service , what do you need today?(Enter your menu option)");//this menu just for the customer service employees
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
               String CustomerName=input.next();//customer info
               System.out.println("Enter customer id:");
               String CustomerId=input.next();//customer info
                System.out.println("Enter order code:");
               String OrderCode=input.next(); //order info
               System.out.println("Enter jewelry price :");
               double JewleryPrice=input.nextDouble();//order info
                             
              if(JewleryPrice >=25000){//to cheeck which class (Golden or Silver) it belongs to, to get his own discount
			     Customer customerG=new Golden(CustomerName,CustomerId);//using polymorphism, belongs to golden class because the price is greater than or equal to 25000 
			     Order ord=new Order(OrderCode,JewleryPrice,customerG);//then after we know the customer classification, we can now creat an Order object which  contains that customer object of goldan class we created
               OurStore.addOrder(ord);//now it will be added to the Order list that inside OurStore object of JewelryStore class if the list has a null index  
                 }
		        else  
              if(JewleryPrice<25000){//this case for the silver class because the price is less than 25000
			     Customer customerS=new Silver(CustomerName,CustomerId);//using polymorphism relation, belongs to silver class
		        Order ord=new Order(OrderCode,JewleryPrice,customerS);// after we checked,  we can now creat an Order object which contains that customer object of silver class we created
	           OurStore.addOrder(ord);//now it will be added to the Order list that inside OurStore object of JewelryStore class if the list has a null index
              }
               break;
               
               
            case 2:
             System.out.println("----------Find order----------");
             System.out.println("Enter order code first to find:");
             OrderCode=input.next();//method searchOrder to activate it wants to receive an order code to compatre with the order codes in that list order  
             Order foundOrder=OurStore.searchOrder(OrderCode);/*it wil return an index if it has the same order code  
		                                                     otherwise it will return null, no matching codes in each index of the list order*/
             if(foundOrder != null)//not null so it received an order object
           System.out.println(" Your order is available");
           else
            System.out.println(" Your order is not  available");
               break;
    
    
            case 3:
              System.out.println("----------Delete order----------");
              System.out.println("Enter order code first to delete :");
              OrderCode=input.next();//method deleteOrder to activate it wants to receive an order code to compatre with the order codes in that list order 
              if(OurStore.deleteOrder(OrderCode)==true)//it return true if this order code is found in the list order then this index will be deleted
		        System.out.println("The deletion was completed successfully");
		        else //otherwise return false  no matching codes in each index of the list order so unsuccessful addition 
              System.out.println("Cannot delete order with this invalid id");
	           break;
             
         
            case 4:
            System.out.println("----------Display order----------");
            System.out.println("Enter order code first to Display :");
             OrderCode=input.next();
             foundOrder=OurStore.searchOrder(OrderCode);//using method searchOrder to return the object order that has the same order code
		       if(foundOrder != null)
            System.out.println("Display all info:\n"+foundOrder.toString());//display all info of this order object by calling toString 
           else// otherwise it will return null, no matching codes in each index of the list order
            System.out.println(" Your order is not available");

               break;
            case 5:
              System.out.println("----------Display today's orderes----------");
              OurStore.display();
      
               break;
            case 6:
            System.out.println("**********Goodbye**********");//it will print this massage then the program ends immediately
               break;
               
            default:
         System.out.println("invalid choice enter from 1-6 :");
         }
      
      }while(ch!=6);
    
   	
   	
   }

}  
      
      
      
