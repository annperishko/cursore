package shapes3D;

import abstractClasses.SpaceShape;
import vertex.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private final double width, height;

    public SquarePyramid(Vertex3D vertex, double width, double height) {
        this.vertices = new Vertex3D[]{vertex};
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2) + 2 * width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "\tSquarePyramid " + "\nvertices = " + Arrays.toString(vertices) + "\nheight = " + height + "\nwidth = "
                + width + "\ndepth = " + getVolume() + "\narea = " + getArea();
    }
}
