//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.salutation();

        System.out.println("\n");

        Calculator calculator = new Calculator();
        int result = calculator.multiplyByTwo(5);
        System.out.println(result);

        System.out.println("\n");

        Song mySong = new Song();
        mySong.title = "Hallelujah";
        mySong.artist = "Leonard Cohen";
        mySong.yearOfRelease = 1984;
        mySong.technicalSheet();
        mySong.evaluation(4.7);
        mySong.evaluation(5.0);
        mySong.evaluation(4.4);
        double average = mySong.averageRating();
        System.out.println("The song average rating is " + average);

        System.out.println("\n");

        Car myCar = new Car();
        myCar.model = "Gol";
        myCar.year = 2023;
        myCar.color = "Black";
        myCar.technicalSheet();
        System.out.println("Car age: " + myCar.calculateYear() + " years");

        System.out.println("\n");

        Student myStudent = new Student();
        myStudent.name = "James";
        myStudent.age = 23;
        myStudent.studentSheet();
    }
}