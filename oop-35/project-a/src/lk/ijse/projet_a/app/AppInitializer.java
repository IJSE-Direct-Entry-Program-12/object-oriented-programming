package lk.ijse.projet_a.app;

import lk.ijse.project_b.api.CustomerApi;
import lk.ijse.project_b.api.ItemApi;
import lk.ijse.project_c.service.CustomerService;

public class AppInitializer {

    public static void main(String[] args) {
        new CustomerApi();
        new ItemApi();
        new CustomerService();
    }
}
