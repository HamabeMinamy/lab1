
/**
 * Abstract class Shape - write a description of the class here
 *
 * LIU Taotao 20084489d
 * XUE Zining 20093963d
 * @version (version number or date here)
 */
public abstract class Shape implements Drawable
{
    protected float area;
    protected float perimeter;
    // To read the shape information from users
    abstract public void readShape();
    
    // To compute the shape’s area
    abstract public void computeArea();
    // To computer the shape’s perimeter
     abstract public void computePerimeter();
    // To display the area and perimeter of the shape
     abstract public void displayShape();
     /**
     * This method is used to test the input is a Float or not
     */
     public static Float tryParseFloat(String input) {
        Float output = null;
        try {
            output = Float.parseFloat(input);

        } catch (Exception e) {
            System.out.println("Invalid input,try again");

        }

        return output;


    }
}
