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
public abstract class Passenger {
    
    private String name;
    private int age;
    
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getname(){
        return name;
    }
    
    public void setname(String n){
        name = n;
    }
    
    public int getage(){
        return age;
    }
    
    public void setage(int a){
        age = a;
    }
    
    public abstract double applyDiscount(double p);
}
