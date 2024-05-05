public class Square implements Shape {
    double side;


    @Override
    public double calculateArea() {
        return side * side;
    }
}
