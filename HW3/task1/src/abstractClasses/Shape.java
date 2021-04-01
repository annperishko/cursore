package abstractClasses;

import vertex.Vertex2D;

public abstract class Shape<T extends Vertex2D> {
    protected T[] vertices;
}
