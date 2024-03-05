package lk.ijse.dep12.project_d.security;

import lk.ijse.dep12.project_a.repository.CustomerRepo;
import lk.ijse.dep12.project_c.security.*;
import lk.ijse.dep12.project_b.security.*;

public class ControllerSecurity {
    ApiSecurity apiSecurity = new ApiSecurity();
    ServiceSecurity serviceSecurity = new ServiceSecurity();
    CustomerRepo customerRepo = new CustomerRepo();
}
