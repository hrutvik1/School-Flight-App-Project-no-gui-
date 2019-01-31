
/**
 *
 * @author hrutvik
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
