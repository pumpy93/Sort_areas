import javax.swing.JOptionPane;

/**
 *
 * @author pumpy
 */
public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle(Point p1, Point p2) {
        setPoint1(p1);
        setPoint2(p2);
    }

    public Rectangle() {
        this(new Point(), new Point());
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getPoint1(), rectangle.getPoint2());
    }

    public Point getPoint1() {
        return new Point(point1);
    }

    public void setPoint1(Point point1) {
        if (point1 != null) {
            this.point1 = new Point(point1);
        } else {
            this.point1 = new Point();
        }
    }

    public Point getPoint2() {
        return new Point(point2);
    }

    public void setPoint2(Point point2) {
        if (point2 != null) {
            this.point2 = new Point(point2);
        } else {
            this.point2 = new Point();
        }
    }

    public double getArea() {
        double area = 0;
        double width = 0;
        double height = 0;

        if (point1.getY() - point2.getY() != 0) {
            height = Math.abs(point1.getY() - point2.getY());
        } else {
            JOptionPane.showMessageDialog(null, "The area cannot be 0");
        }

        if (point1.getX() - point2.getX() != 0) {
            width = Math.abs(point1.getX() - point2.getX());
        } else {
            JOptionPane.showMessageDialog(null, "The area cannot be 0");
        }

        area = height * width;

        return area;
    }

    public static Rectangle[] sortRectangles(Rectangle[] rectangleArray) {

        Rectangle[] sortedRectangles = new Rectangle[rectangleArray.length];

        for (int i = 0; i < sortedRectangles.length; i++) {
            if (rectangleArray[i] != null) {
                sortedRectangles[i] = new Rectangle(rectangleArray[i]);
            } else {
                sortedRectangles[i] = new Rectangle();
            }

        }

        for (int i = 0; i < sortedRectangles.length - 1; ++i) {
            for (int j = 0; j < (sortedRectangles.length - 1) - i; ++j) {
                if (sortedRectangles[j].getArea()
                        > sortedRectangles[j + 1].getArea()) {
                    Rectangle temp = new Rectangle(sortedRectangles[j]);
                    sortedRectangles[j] = new Rectangle(sortedRectangles[j + 1]);
                    sortedRectangles[j + 1] = new Rectangle(temp);
                }
            }
        }

        return sortedRectangles;
    }

    public String toString() {
        return String.format("[%s, %s]", getPoint1().toString(),
                getPoint2().toString());
    }

}
