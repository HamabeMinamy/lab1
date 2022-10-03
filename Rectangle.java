import java.awt.geom.Rectangle2D;
import java.util.Scanner;
/**
 * Write a description of class Rectangle here.
 *LIU Taotao 20084489d
 * XUE Zining 20093963d
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private float length;
    private float width;
    public Rectangle()
    {
        
    }
    public Rectangle(float l, float w)
    {
        length = l;
        width  = w;
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
        Float testWidth = null;
        while (testWidth == null) {
                String value = obj.nextLine();
                testWidth = tryParseFloat(value);
        }
        width = testWidth;
   }
   public void computeArea(){
       area = length * width;
    }
    public void computePerimeter(){
        perimeter = 2f*(length+width);
    }
    public void displayShape(){
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Rectangle2D.Float(200,200,length,width));

    }
}
