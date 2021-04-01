package vertex;

public class Vertex2D {
    private final double x;
    private final double y;
    public Vertex2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Vertex2D vertex2D){
        return Math.sqrt(Math.pow(this.x - vertex2D.x, 2) + Math.pow(this.y - vertex2D.y, 2));

    }


    @Override
    public String toString(){
        return "Vertex 2D:" + "\nx = " + x + "\ny = " + y;
    }
}
