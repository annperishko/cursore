package shapes2D;

import abstractClasses.PlaneShape;
import vertex.Vertex2D;

import java.util.Arrays;

public class Rectangle extends PlaneShape {
    private final double height;
    private final double width;


    public Rectangle(Vertex2D vertex, double height, double width) {

        this.vertices = new Vertex2D[]{vertex};
        this.height = height;
        this.width = width;

    }


    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "\tRectangle " + "\nvertices = " + Arrays.toString(vertices) + "\nwidth = " + width + "\nheight = " + height
                + "\nperimeter = " +
                getPerimeter() + "\narea = " + getArea();
    }
}
