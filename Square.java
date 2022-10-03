import java.awt.geom.Rectangle2D;
import java.util.Scanner;

/**
 * Write a description of class Square here.
 *
 * LIU Taotao 20084489d
 * XUE Zining 20093963d
 * @version (a version number or a date)
 */
public class Square extends Shape implements Drawable
{
    private float length;
    public Square()
    {
        length = 0;
        area = 0f;
        perimeter = 0f;
    }
    public Square(float l)
    {
        length = l;
    }

   public void readShape(){
       Scanner obj = new Scanner(System.in);
       System.out.println("Please input the length:");
        Float testLength = null;
        while (testLength == null) {
                String value = obj.nextLine();
                testLength = tryParseFloat(value);
        }
        length = testLength;
   }
   public void computeArea(){
       area = length * length;
    }
    public void computePerimeter(){
        perimeter = length * 4.0f;
    }
    public void displayShape(){
        System.out.println("Area of square = " + area);
        System.out.println("Perimeter of square = " + perimeter);
    }


    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Rectangle2D.Float(100,100,length,length));

    }
}
