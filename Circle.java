


/**
 * Write a description of class Circle here.
 *
 * LIU Taotao 20084489d
 * XUE Zining 20093963d
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;

public class Circle extends Shape implements Drawable
{
    private float radius;
    public Circle(){
       radius = 0f;
       area = 0f;
       perimeter = 0f;
   }
   public Circle(float r){
       this.radius = r;
   }
   public void readShape(){
       Scanner obj = new Scanner(System.in);
       System.out.println("Please input the length:");
        Float testRadius = null;
        while (testRadius == null) {
                String value = obj.nextLine();
                testRadius = tryParseFloat(value);
        }
        radius = testRadius;
   }
   public void computeArea(){
       area = (float)Math.PI*radius*radius;
    }
    public void computePerimeter(){
        perimeter = 2*(float)Math.PI*radius;
    }
    public void displayShape(){
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);
    }

    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Ellipse2D.Float(0,0,2*radius,2*radius));

    }
}
