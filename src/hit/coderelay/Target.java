/**
 * This class is a POJO class and mainly used as passed argument. 
 */
package hit.coderelay;

/**
 * @author haijun
 *
 */
public class Target {
    private int x; 
    private int y;
    
    public Target() {
        this.x = 0;
        this.y = 0;
    }
    
    public Target(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    } 
    
    public void print() {
        System.out.print("(" + this.x + ", " + this.y + ")");
    }
}
