/**
 * This class contains helper methods. 
 */
package hit.coderelay;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Properties;

/**
 * @author haijun
 * 
 */
public class Utils {
    public static final String BIN_FOLER = "../bin/";
    public static final String PACKAGENAME = "hit.coderelay.";
    private static final String PROPERTY_FILENAME = "class.properties";
    public static final String MY_CLASSNAME_LITERAL = "MyClassName";
    public static final String PREVIOUS_CLASSNAME_LITERAL = "LastClassName";

    public static String readMyClassName() throws IOException {
        Properties props = new Properties();
        InputStream stream = Utils.class.getResourceAsStream(PROPERTY_FILENAME);
        props.load(stream);
        return props.getProperty(MY_CLASSNAME_LITERAL);
    }

    public static String readLastClassName() throws IOException {
        Properties props = new Properties();
        InputStream stream = Utils.class.getResourceAsStream(PROPERTY_FILENAME);
        props.load(stream);
        return props.getProperty(PREVIOUS_CLASSNAME_LITERAL);
    }

    public static void callMyMethod(Target t) {
        try {
            // the .class file folder
            File classFile = new File(BIN_FOLER);

            // the class name of the my or previous class
            String className = PACKAGENAME + readMyClassName();

            // load and instantiate it.
            URLClassLoader classLoader = new URLClassLoader(
                    new URL[] { classFile.toURI().toURL() });
            Class<?> clazz = classLoader.loadClass(className);
            Object instance = clazz.newInstance();

            // get the method list
            Method[] methods = clazz.getMethods();

            methods[0].invoke(instance, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void callLastMethod(Target t) {
        try {
            // the .class file folder
            File classFile = new File(BIN_FOLER);

            // the class name of the my or previous class
            String className = PACKAGENAME + readLastClassName();

            // load and instantiate it.
            URLClassLoader classLoader = new URLClassLoader(
                    new URL[] { classFile.toURI().toURL() });
            Class<?> clazz = classLoader.loadClass(className);
            Object instance = clazz.newInstance();

            // get the method list
            Method[] methods = clazz.getMethods();

            methods[0].invoke(instance, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
