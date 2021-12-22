public class EquilateralTriangle implements Polygon {
    protected double area;
    protected double perimeter;
    protected double sideone;


public EquilateralTriangle(double a, double p, double s1){
    a = area;
    p = perimeter;
    s1 = sideone;
}




    @Override
    public double area() {
    area = (double)(((Math.sqrt(3)) / 4) * sideone * sideone);
        return area;
    }

    @Override
    public double perimeter() {
    perimeter = 3 * (sideone);
        return perimeter;
    }
}
