package shapes3D;

import abstractClasses.SpaceShape;
import vertex.Vertex3D;
import java.util.Arrays;

public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertex3D vertex, double radius) {
        this.vertices = new Vertex3D[]{vertex};
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
    @Override
    public String toString(){
        return "\tSphere " + "\nvertices = " + Arrays.toString(vertices) + "\nradius = " + radius + "\nvolume = " +
                getVolume() + "\narea = " + getArea();
    }
}
