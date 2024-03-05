// module lk.ijse.project_a {                               // Normal Module
open module lk.ijse.project_a {                             // Open Module
    requires java.base;
    requires java.sql;
    // exports lk.ijse.project_a.repo;                      // Unqualified export
    exports lk.ijse.project_a.repo to lk.ijse.project_b;    // Qualified export
    //opens lk.ijse.project_a.repo;                         // Unqualified open
    // opens lk.ijse.project_a.repo to lk.ijse.project_b;   // Qualified open
}