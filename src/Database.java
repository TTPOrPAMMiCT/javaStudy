public class Database {
    private int id;
    private String name;
    private String telephone;

    public Database createUser(int id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        return this;
    }
}
