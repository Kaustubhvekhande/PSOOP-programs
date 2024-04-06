abstract class Shape {
    abstract double rectangleArea(double l, double b);

    abstract double squareArea(double s);

    abstract double circleArea(double r);

}


class Working extends  Shape {

    @Override
    double rectangleArea(double l, double b) {
        return l * b;
    }

    @Override
    double squareArea(double s) {
        return Math.pow(s,2);
    }

    // Method to calculate the area of a circle given its radius
    @Override
    double circleArea(double r) {
        return Math.PI * squareArea(r);
    }
}

