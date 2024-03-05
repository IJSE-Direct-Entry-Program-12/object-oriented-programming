package lk.ijse.dep12.project_b.service;

import lk.ijse.dep12.project_b.security.*;
import lk.ijse.dep12.project_a.repository.CustomerRepo;

public class CustomerService {
    ServiceSecurity security = new ServiceSecurity();
    CustomerRepo repo = new CustomerRepo();
}
