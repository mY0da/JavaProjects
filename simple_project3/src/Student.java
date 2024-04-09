public class Student {
    private String name;
    private double grade;
    private double grades;
    private int gradesNum;

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
        grades += grade;
        gradesNum++;
    }

    public double averageGrade() {
        return grades / gradesNum;
    }
}
