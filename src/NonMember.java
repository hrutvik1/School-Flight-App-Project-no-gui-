

/**
 *
 * @author hrutvik
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
