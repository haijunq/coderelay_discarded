/**
 * This class is the driver class available to everyone. 
 */
package hit.coderelay;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author haijun
 *
 */
public class MainDriver {


    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create a list of 9 targets at different place
        ArrayList<Target> targets = new ArrayList<>();
        targets.add(new Target(0,0)); 
        targets.add(new Target(1,0)); 
        targets.add(new Target(0,1)); 
        targets.add(new Target(-1,0)); 
        targets.add(new Target(0,-1)); 
        targets.add(new Target(1,1)); 
        targets.add(new Target(-1,1)); 
        targets.add(new Target(1,-1)); 
        targets.add(new Target(-1,-1)); 
        
        try {
            for (Target t : targets) {
                t.print();
                System.out.print(" -> ");

                // invoke the method on targets
                Utils.callMyMethod(t);
                
                t.print();
                System.out.println();
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

}
