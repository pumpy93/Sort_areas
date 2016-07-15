import java.util.Random;

/**
 *
 * @author pumpy
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();
        Rectangle[] rectangleArray = new Rectangle[10];

        for (int i = 0; i < rectangleArray.length; i++) {
            rectangleArray[i] = new Rectangle(
                    new Point(
                            -100.0 + rand.nextInt(201),
                            -100.0 + rand.nextInt(201)),
                    new Point(
                            -100.0 + rand.nextInt(201),
                            -100.0 + rand.nextInt(201))
            );
        }

        Rectangle[] sortedRectangles = Rectangle.sortRectangles(rectangleArray);

        for (int i = 0; i < sortedRectangles.length; ++i) {
            System.out.printf("%s, %.3f\n", sortedRectangles[i].toString(),
                    sortedRectangles[i].getArea());
        }

    }

}
