public class Triangle implements Polygon {
    private double sidethree;
    private double sideone;
    private double sidetwo;



    public Triangle(){ //default constructor
        sideone = 0;
        sidetwo = 0;
        sidethree = 0;
    }

    public Triangle(double d, double e, double f){
        sideone = d;
        sidetwo = e;
        sidethree = f;
    }

    @Override
    public double area() { //area formula for triangle
        double tarea = (0.5)*(sideone)+(sidetwo)+(sidethree);
        return Math.sqrt(tarea*(tarea-sideone)*(tarea-sidetwo)*(tarea-sidethree));
    }

    @Override
    public double perimeter() { //perimeter formula for perimeter
        return sideone + sidetwo + sidethree;
    }
}
