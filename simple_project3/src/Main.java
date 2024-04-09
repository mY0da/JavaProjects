//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123);
        account.setBalance(1000);

        account.accountHolder = "Gus";
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account holder: " + account.accountHolder);

        System.out.println("\n");

        personAge person1 = new personAge();
        person1.setName("James");
        person1.setAge(22);

        personAge person2 = new personAge();
        person2.setName("Chris");
        person2.setAge(26);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        person1.verifyAge();

        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        person2.verifyAge();

        System.out.println("\n");

        Product product = new Product();
        product.setName("Cell phone");
        product.setPrice(2000.0);

        System.out.println("Name of the product: " + product.getName());
        System.out.println("Price: " + product.getPrice());

        product.applyDiscount(20);
        System.out.println("Price with 20% discount: " + product.getPrice());

        System.out.println("\n");

        Student student = new Student();
        student.setName("Michael");
        student.setGrade(7.5);
        student.setGrade(8.0);
        student.setGrade(9.2);

        System.out.println("Student's name: " + student.getName());
        System.out.println("Average grade: " + student.averageGrade());

        System.out.println("\n");

        Book book = new Book();
        book.setTitle("Lord of the Rings - The fellowship of the ring");
        book.setAuthor("John Ronald Reuel Tolkien");

        book.showDetails();
    }
}