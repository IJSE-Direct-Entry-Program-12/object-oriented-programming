module lk.ijse.dep12.project_c {
    requires transitive lk.ijse.dep12.project_b;
    requires lk.ijse.dep12.project_a;

    exports lk.ijse.dep12.project_c.security;
    exports lk.ijse.dep12.project_c.api;
}