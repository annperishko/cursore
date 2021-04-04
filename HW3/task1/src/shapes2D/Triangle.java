package shapes2D;

import abstractClasses.PlaneShape;
import vertex.Vertex2D;
import java.util.Arrays;

public class Triangle extends PlaneShape {
    private double ab;
    private double bc;
    private double ca;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.vertices = new Vertex2D[]{a, b, c};
        distance();
    }

    private void distance() {
        ab = vertices[0].getDistance(vertices[1]);
        bc = vertices[1].getDistance(vertices[2]);
        ca = vertices[2].getDistance(vertices[0]);
    }

    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ca));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ca;
    }

    @Override
    public String toString() {
        return "\tTriangle " + "\nvertices = " + Arrays.toString(vertices) + "\nab = " + ab + "\nbc = " + bc + "\nca = "
                + ca + "\nperimeter = " +
                getPerimeter() + "\narea = " + getArea();
    }
}
