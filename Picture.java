/**
 * LIU Taotao 20084489d
 * XUE Zining 20093963d
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Picture {
    private ArrayList shapes;
    public Picture(){
        shapes = new ArrayList();
    }
    void addShape (Shape s){
        shapes.add(s);

    }
    void computeShape(){
        for (Iterator iterator = shapes.iterator(); iterator.hasNext(); ) {
            Shape shape = (Shape) iterator.next();
            shape.computeArea();
            shape.computePerimeter();
        }
    }
    public void listAllShapeTypes(){
        for (Iterator iterator = shapes.iterator(); iterator.hasNext(); ) {
            Shape shape = (Shape) iterator.next();
            shape.displayShape();
        }

    }
    public void listSingleShapeType(String className){
        for (Iterator iterator = shapes.iterator(); iterator.hasNext(); ) {
            Shape shape = (Shape) iterator.next();
            if (shape.getClass().getName().equals(className)){
                shape.displayShape();
            }
        }
    }
}
