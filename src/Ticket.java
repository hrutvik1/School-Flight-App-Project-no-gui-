

/**
 *
 * @author hrutvik
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number = 0;
    
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        number++;
    }
    
    public Passenger getPassenger(){
        return passenger;
    }
    
    public void setPassenger(Passenger a){
        passenger = a;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public void setFlight(Flight f){
        flight = f;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(int n){
        number = n;
    }
    
    @Override
    public String toString(){
    return passenger.getname() + ", " + "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " + flight.getDepartureTime() + ", " + "Original price: " + flight.getOriginalPrice() + ", " + "Ticket price: $" + getPrice();
  }
}
