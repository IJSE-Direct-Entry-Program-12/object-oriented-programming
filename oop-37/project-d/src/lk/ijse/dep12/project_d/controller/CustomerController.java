package lk.ijse.dep12.project_d.controller;

import lk.ijse.dep12.project_a.repository.CustomerRepo;
import lk.ijse.dep12.project_d.security.ControllerSecurity;
import lk.ijse.dep12.project_c.api.*;
import lk.ijse.dep12.project_b.service.*;

public class CustomerController {
    ControllerSecurity security = new ControllerSecurity();
    CustomerService customerService = new CustomerService();
    CustomerApi customerApi = new CustomerApi();
    CustomerRepo repo = new CustomerRepo();
}
