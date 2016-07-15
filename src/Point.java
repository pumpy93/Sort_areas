/**
 *
 * @author pumpy
 */
public class Point {
    
    private double x;
    private double y;
    
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public Point() {
        this(0, 0);
    }
    
    public Point(Point point) {
        this(point.getX(), point.getY());
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public String toString() {
        return String.format("[%.3f; %.3f]", getX(), getY());
    }
    
}
