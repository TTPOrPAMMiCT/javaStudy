package SystemObjekts;

public class Author {
    public String name;
    public String telephone;
    public int age;

    public Author(String name, String telephone, int age) {
        this.name = name;
        this.telephone = telephone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", age=" + age +
                '}';
    }
}
