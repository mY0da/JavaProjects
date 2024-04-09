//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarModel myCar = new CarModel();
        myCar.setModel("Sedan");
        myCar.setPrices(30000, 32000, 35000);
        myCar.showInfo();

        Dog dog = new Dog();
        dog.makeSound();
        dog.shakeTail();

        Cat cat = new Cat();
        cat.makeSound();
        cat.scratchFurniture();
    }
}