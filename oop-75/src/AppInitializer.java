public class AppInitializer {

    public static void main(String[] args) {

    }
}

interface DatabaseOperations{
    void save();
    void update();
    void delete();
    void query();
}

class Database implements DatabaseOperations{

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void query() {

    }
}

class Database2 implements DatabaseOperations{

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void query() {

    }
}

class MyBusinessClass{
//    DatabaseOperations databaseOperations = new Database1();
    DatabaseOperations databaseOperations = new Database2();

    public void creditAmount(){
        databaseOperations.update();
    }
}
