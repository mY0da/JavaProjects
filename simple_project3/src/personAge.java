public class personAge {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verifyAge() {
        if (age >= 18) {
            System.out.println(name + " is of legal age.");
        } else {
            System.out.println(name + " is not of legal age!");
        }
    }
}
