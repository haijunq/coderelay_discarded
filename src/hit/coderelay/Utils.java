/**
 * This class contains helper methods. 
 */
package hit.coderelay;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author haijun
 *
 */
public class Utils {
    private static final String PROPERTY_FILENAME = "class.properties";
    private static final String CLASSNAME_LITERAL = "className";
    
    public static String readClassName() throws IOException {
        Properties props = new Properties();
        InputStream stream = Utils.class.getResourceAsStream(PROPERTY_FILENAME);
        props.load(stream);        
        return props.getProperty(CLASSNAME_LITERAL);
    }

}
