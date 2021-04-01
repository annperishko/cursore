import abstractClasses.Shape;
import shapes2D.Circle;
import shapes2D.Rectangle;
import shapes2D.Triangle;
import shapes3D.Cuboid;
import shapes3D.Sphere;
import shapes3D.SquarePyramid;
import vertex.Vertex2D;
import vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        Shape<?>[] shapes = new Shape[]{
                new Circle(new Vertex2D(5, 3), 7),
                new Rectangle(new Vertex2D(7, 10), 5, 5),
                new Triangle(new Vertex2D(4, 5), new Vertex2D(8, 12), new Vertex2D(3, 2)),
                new Cuboid(new Vertex3D(5, 8, 10), 5, 3, 6),
                new Sphere(new Vertex3D(4, 6, 7), 15),
                new SquarePyramid(new Vertex3D(5, 2, 3), 7, 9)
        };
        for (Shape<?> shape : shapes) {
            System.out.println(shape);
        }

    }
}
