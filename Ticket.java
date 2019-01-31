/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author JAK
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
    
    public Passenger getpassenger(){
        return passenger;
    }
    
    public void setpassenger(Passenger a){
        passenger = a;
    }
    
    public Flight getflight(){
        return flight;
    }
    
    public void setflight(Flight f){
        flight = f;
    }
    
    public double getprice(){
        return price;
    }
    
    public void setprice(double p){
        price = p;
    }
    
    public int getnumber(){
        return number;
    }
    
    public void setnumber(int n){
        number = n;
    }
    
    @Override
    public String toString(){
    return passenger.getname() + ", " + "Flight " + flight.getflightNumber() + ", " + flight.getorigin() + " to " + flight.getdestination() + ", " + flight.getdepartureTime() + ", " + "Original price: " + flight.getoriginalPrice() + ", " + "Ticket price: $" + getprice();
  }
}
