
/**
 *
 * @author hrutvik
 */
public class Flight {
    
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private  int numberOfSeatsLeft = 10;
    private double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft=capacity-1; //or just capacity?
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and destination cannot be the same");
        }
    }

  
     
    public int getFlightNumber() {
        return flightNumber; 
    }
    
    public void setFlightNumber(int flightNum) {
        flightNumber = flightNum;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public void setOrigin(String orig) {
        origin = orig;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String dest) {
        destination = dest;
    }
    
    public String getDepartureTime() {
        return departureTime;
    }
    
    public void setDepartureTime(String time){
        departureTime = time;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(int cap){
        capacity = cap;
    }
    
   /* public int getnumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public void setnumberOfSeatsLeft(iint seatsLeft){
        numberOfSeatsLeft = seatsLeft;
    }*/
    
    public double getOriginalPrice(){
        return originalPrice;
    }
    
    public void setOriginalPrice(double price){
        originalPrice = price;
    }
    
    public  boolean bookASeat(){
        if (numberOfSeatsLeft>0){
            numberOfSeatsLeft--;
            return true;
        }
        
        else {return false;}
        
    }
    
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", Original price:" + originalPrice + "$";
    }
    
}
