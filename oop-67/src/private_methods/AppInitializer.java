package private_methods;

public class AppInitializer {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.myCrazyMethod();
    }
}

class ParentClass{
    private void myMethod(){
        System.out.println("ParentClass: myMethod");
    }
    public void myCrazyMethod(){
        myMethod();
    }
}
class ChildClass extends ParentClass{

    // This method does not override the ParentClass's myMethod because it is private
    public void myMethod(){
        System.out.println("ChildClass: myMethod");
    }
}
