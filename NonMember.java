/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author jahkim
 */
public class NonMember extends Passenger {
    
    public NonMember(String name, int age){
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p){
        
        if (getage() > 65){
            return p*0.9;
        }
        
        else {return p;}
    }
    
}
