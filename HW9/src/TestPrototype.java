import java.util.ArrayList;
import java.util.List;

public class TestPrototype {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Triangle triangle = new Triangle();
        triangle.sideA = 2;
        triangle.sideB = 2;
        triangle.sideC = 3;
        triangle.color = "green";
        shapes.add(triangle);

        Circle circle = new Circle();
        circle.radius = 2;
        circle. color = "black";
        shapes.add(circle);

        CloneAndCompare clone = new CloneAndCompare();
        clone.cloneAndCompare(shapes, shapesCopy);



    }

}

