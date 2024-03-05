package lk.ijse.team_a.project_a;

import lk.ijse.team_b.project_b.api.*;
import lk.ijse.team_b.project_b.security.Encorder;
import lk.ijse.team_b.project_b.security.PasswordStore;

import java.lang.annotation.Annotation;

public class AppInitializer {

    public static void main(String[] args) {
        new EmployeeApi();
        new DepartmentApi();
        new PasswordStore();
        new Encorder();
    }
}
