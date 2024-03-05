package lk.ijse.project_c.controller;

import lk.ijse.project_a.repo.EmployeeRepository;
import lk.ijse.project_c.util.AopUtil;
import lk.ijse.project_b.service.*;

public class EmployeeController {

    public static void main(String[] args) {
        AopUtil aopUtil = new AopUtil();
        EmployeeService employeeService = new EmployeeService();
        EmployeeRepository employeeRepository = new EmployeeRepository();
    }

}
