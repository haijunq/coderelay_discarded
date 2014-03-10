package hit.coderelay;

public class ClassA {
    
    public void methodA(Target t) {
        int temp = t.getY();
        t.setY(t.getX());
        t.setX(temp);
    }

}
