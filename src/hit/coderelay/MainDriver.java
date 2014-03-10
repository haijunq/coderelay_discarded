/**
 * This class is the driver class available to everyone. 
 */
package hit.coderelay;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

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
            // the .class file folder
            File classFile = new File("../bin/");
            
            // the class name of the previous class
            String className = "hit.coderelay.ClassA";
            
            // load and instantiate it. 
            URLClassLoader classLoader = new URLClassLoader(new URL[]{classFile.toURI().toURL()});
            Class<?> clazz = classLoader.loadClass(className);
            Object instance = clazz.newInstance();
            
            // get the method list
            Method [] methods = clazz.getMethods(); 
            
            for (Target t : targets) {
                t.print("before");
                
                // invoke the method on targets
                methods[0].invoke(instance, t);
                t.print(" after");
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

}
