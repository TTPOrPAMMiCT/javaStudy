package SystemObjekts;

public class Parameters {
    private String name;
    private int id;
    private int age;

    public void setName (String name) {
        this.name = name;
    }

    public void setId(int id) {
         this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void Enter() {
        System.out.println("id = " + id + "   "
                                            + "age = "+ age + "   "
                                                                    + "name ="+ name);
    }
}
