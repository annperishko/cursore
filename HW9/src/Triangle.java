public class Triangle extends Shape {
    public int sideA;
    public int sideB;
    public int sideC;

    public Triangle() {
    }


    public Triangle(Triangle target) {
        super(target);
        if (target != null) {
            this.sideA = target.sideA;
            this.sideB = target.sideB;
            this.sideC = target.sideC;

        }
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) return false;
        Triangle shape = (Triangle) obj;
        return shape.sideA == sideA && shape.sideB == sideB
                && shape.sideC == sideC;
    }
}
