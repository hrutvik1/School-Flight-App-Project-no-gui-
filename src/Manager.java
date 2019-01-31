
/**
 *
 * @author hrutvik
 */
import java.util.*;
public class Manager {
    
    static    Flight flight = null;
static Ticket ticket= null;


    private int numberOfFlights;
    private int numberOfTickets=99;
    

    
     Flight [] flights = new Flight[99];
     Ticket [] issuedTickets = new Ticket[numberOfTickets];

  
     
    public  void createFlights(){
                       
        Scanner in= new Scanner (System.in);

        
        for(int i=0;i<numberOfFlights;i++){

           System.out.println("--------------------------------");

        System.out.println("Enter the flight number: ");
        int  flightNumber= in.nextInt();

  System.out.println("Now enter the Origin: ");        
                String origin = in.nextLine();
                 origin = in.nextLine();

        System.out.println("Now enter the Destination: ");
                String destination = in.nextLine();
                
        System.out.println("Now enter the departure time: ");
                String departureTime = in.nextLine();

        System.out.println("Now enter the flight capacity: ");
                int capacity= in.nextInt();

        System.out.println("Now enter the flight price: ");
       double price= in.nextDouble();
       
       flight=new Flight(flightNumber , origin , destination , departureTime , capacity, price);

       flight.setFlightNumber(flightNumber);
       flight.setOrigin(origin);
       flight.setDestination(destination);
       flight.setDepartureTime(departureTime);
       flight.setCapacity(capacity);
       flight.setOriginalPrice(price);
 
       flights[i]=new Flight(flightNumber , origin , destination , departureTime , capacity, price);
        }    
    }
        
    
   public void displayAvailableFlights(String origin, String destination){
       System.out.println("These are all the unbooked flights that go from " + origin+ " to "+ destination + ":");
       int x=0;
      for(int i=0;i<numberOfFlights;i++){
          if(flights[i].getOrigin().equals(origin) && flights[i].getDestination().equals(destination)){
             x++;
              if(flights[i].getCapacity()>0){
              System.out.println(flights[i].toString());
              }
          } 
       }
       if (x==0){
            throw new IllegalArgumentException("there are no flights with that configuration, Re-run the program");
       }
   }
           
    public Flight getFlight(int flightNumber){
      //  return f1(flightNumber);//flight obj for specificed flight number 
     for(int i=0;i<numberOfFlights;i++){
      if(flights[i].getFlightNumber()==flightNumber){
      return flights[i];
     }
     }
     return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
        for(int i=0;i<numberOfFlights;i++){
            
      if(flights[i].getFlightNumber()==flightNumber){
          
          ticket=new Ticket(p,flights[i],p.applyDiscount(flights[i].getOriginalPrice()));
          
          
          for(int x=0;x<numberOfTickets;x++){
          issuedTickets[x]= ticket;
          
          System.out.print("Ticket information: ");
          System.out.println(issuedTickets[x].toString());
          break;
          }
      //book seat in this flight 
     }
      
     }
    }
    public static void main(String[] args ){
        
        Scanner in= new Scanner (System.in);               
        Manager manager= new Manager();

        
        System.out.println("Hi manager this is the creating flights menu, how many flights would you like to make?");      
        manager.numberOfFlights=in.nextInt();
        
        manager.createFlights();                
         
                System.out.println();
                        System.out.println("--------------------------------");

       String again="yes"; 
        do{

        System.out.println("Where would the passenger like to go?");
        System.out.println("Enter origin here: ");
        String origin = in.nextLine();  
         origin = in.nextLine(); 
        System.out.println("Enter destination here: ");
        String destination = in.nextLine(); 
                
        System.out.println();
        manager.displayAvailableFlights(origin,destination); 
        
        manager.getFlight(flight.getFlightNumber());
     
        System.out.println();
        System.out.println("You are now entering the passenger information. Enter their name: ");        
        String name= in.nextLine();
        System.out.println("Enter their age: ");        
        int age= in.nextInt();
        System.out.println("Enter year(s) of passenger's membership. If they're not a member, enter 0");        
        int yearsOfMemberShip= in.nextInt();     
               
        System.out.println("Ok, which of the availible flights would the passenger like to book (enter flight number): ");
        int flightNumber= in.nextInt();

        if(yearsOfMemberShip>=1){        
            Passenger p = new Member(name,age,yearsOfMemberShip);                   
            manager.bookSeat(flightNumber, p);           
        }  
        
        else{
            Passenger p = new NonMember(name,age);           
            manager.bookSeat(flightNumber, p);        
        }          
        
        //
    System.out.println("would you like to add another passenger? (enter yes or no)");
             again= in.nextLine();   
                          again= in.nextLine();     

    
        } while(again.equals("yes"));
        
    }
}

