import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Database user = new Database();
        int i = 0;
        while (i != 4) {
            Scanner value = new Scanner(System.in);
            i = value
                    .nextInt();
            switch (i) {
                case 1 :
                    System.out.println(user
                            .createUser(11,  "denis","+375257230465"));
                    break;
            }
        }
    }
}