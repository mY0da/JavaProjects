public class RectangularRoomCalculus implements GeometricCalculus {
    @Override
    public void areaCalculation(double height, double width) {
        double area = height * width;
        System.out.println("The area is: " + area);
    }

    @Override
    public void perimeterCalculation(double height, double width) {
        double perimeter = 2 * (height + width);
        System.out.println("The perimeter is: " + perimeter);
    }
}
