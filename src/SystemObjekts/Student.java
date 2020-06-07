package SystemObjekts;

public class Student {
    public String name;
    public String telephone;
    public int age;

    public Student(String name, String telephone, int age) {
        this.name = name;
        this.telephone = telephone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                '}';
    }
}
