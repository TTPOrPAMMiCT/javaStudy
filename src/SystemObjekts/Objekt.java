package SystemObjekts;

public class Objekts {

    void create(int id, int age, String name) {

        Parameters parameters = new Parameters();
        parameters.setAge(age);
        parameters.setId(id);
        parameters.setName(name);
        parameters.Enter();
    }

}
