/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author jahkim
 */
public class Flight {
    
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    public static int numberOfSeatsLeft = 10;
    public double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and destination cannot be the same");
        }
    }
     
    public int getflightNumber() {
        return flightNumber; 
    }
    
    public void setflightNumber(int flightNum) {
        flightNumber = flightNum;
    }
    
    public String getorigin() {
        return origin;
    }
    
    public void setorigin(String orig) {
        origin = orig;
    }
    
    public String getdestination() {
        return destination;
    }
    
    public void setdestination(String dest) {
        destination = dest;
    }
    
    public String getdepartureTime() {
        return departureTime;
    }
    
    public void setdepartureTime(String time){
        departureTime = time;
    }
    
    public int getcapacity(){
        return capacity;
    }
    
    public void setcapacity(int cap){
        capacity = cap;
    }
    
   /* public int getnumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public void setnumberOfSeatsLeft(iint seatsLeft){
        numberOfSeatsLeft = seatsLeft;
    }*/
    
    public double getoriginalPrice(){
        return originalPrice;
    }
    
    public void setoriginalPrice(double price){
        originalPrice = price;
    }
    
    public static boolean bookASeat(){
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
