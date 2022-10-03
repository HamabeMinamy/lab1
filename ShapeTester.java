import java.util.Scanner;
/**
 * Write a description of class ShapeTester here.
 * LIU Taotao 20084489d
 * Xue Zining 20093963d
 * @version (a version number or a date)
 */
public class ShapeTester {
    public static void main(String[] args) {
        boolean isOver = false;
        
        while (!isOver) {
            isOver = menu(); // Invoke menu;
            
        }

    }

    /**
     * This method is used to display the options which users can input
     */
    private static void displayOptions() {
        System.out.println();
        System.out.println();
        //Print 38 * on the firstLine
        for (int i = 0; i < 38; ++i) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* Please choose one the followings:  *");
        System.out.println("* Press 'c' - Circle                 *");
        System.out.println("* Press 's' - Square                 *");
        System.out.println("* Press 'r' - Rectangle              *");
        System.out.println("* Press 'x' - EXIT                   *");
        //Print 38 * on the lastLine
        for (int i = 0; i < 38; ++i) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * This method is used to test the input is a Float or not
     */
    private static Float tryParseFloat(String input) {
        Float output = null;
        try {
            output = Float.parseFloat(input);

        } catch (Exception e) {
            System.out.println("Invalid input,try again");

        }

        return output;


    }
    
    
    /**
     * This method is used to create a menu
     */
    private static boolean menu() {
        Scanner obj = new Scanner(System.in);
        displayOptions();
        String input = obj.nextLine();
        String value;
        Shape shape = null;
        switch (input) {
            case "c": {
                shape = new Circle();
                break;

            }


            case "s": {
                shape = new Square();
                break;
            }

            case "r": {
                shape = new Rectangle();
                break;
            }
            case "x":
                System.exit(0); // End the loop
            default:
                System.out.print("Invalid command!");

        }
        shape.readShape();
        shape.computeArea();
        shape.computePerimeter();
        shape.displayShape();
        shape.draw();
        
        return false;


    }
}

