import team_b.*;
import team_a.*;
//import team_a.Customer;
//import team_b.Item;

public class AppInitializer {
    public static void main(String[] args) {
        /* Team A */
        new team_a.Customer();
        new team_a.Item();
        new Service();
        new Utility();

        /* Team B */
        new team_b.Customer();
        new team_b.Item();
        new Api();
        new Test();
    }
}
