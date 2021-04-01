package shapes2D;

import abstractClasses.PlaneShape;
import vertex.Vertex2D;

import java.util.Arrays;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(Vertex2D vertex, double radius){
        this.vertices = new Vertex2D[]{vertex};
        this.radius = radius;


    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "\tCircle " + "\nvertices = " + Arrays.toString(vertices) + "\nradius = " + radius + "\nperimeter = " +
                getPerimeter() + "\narea = " + getArea();
    }
}
