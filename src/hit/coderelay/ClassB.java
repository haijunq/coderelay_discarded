/**
 * 
 */
package hit.coderelay;

/**
 * @author haijun
 *
 */
public class ClassB {
    public void methodB(Target t) {
        Utils.callLastMethod(t);
        t.setX(t.getX() + 1);
        t.setY(t.getY() + 1);
    }
}
