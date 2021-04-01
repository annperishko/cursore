package shapes3D;

import abstractClasses.SpaceShape;
import vertex.Vertex3D;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    //holds 1 vertex, width, height, depth

    private final double width, height, depth;


    public Cuboid(Vertex3D vertex, double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.vertices = new Vertex3D[]{vertex};
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "\tCuboid " + "\nvertices = " + Arrays.toString(vertices) + "\nheight = " + height + "\nwidth = " + width + "\ndepth = " + depth + "\nvolume = " +
                getVolume() + "\narea = " + getArea();
    }
}
