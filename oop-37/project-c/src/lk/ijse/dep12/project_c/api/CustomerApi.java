package lk.ijse.dep12.project_c.api;

import lk.ijse.dep12.project_c.security.*;
import lk.ijse.dep12.project_b.service.CustomerService;

public class CustomerApi {
    ApiSecurity security = new ApiSecurity();
    CustomerService customerService = new CustomerService();
}
