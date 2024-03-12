package a;

public class MyClass1 {

    private void myPrivateMethod(){
        System.out.println("MyClass1: Private Method");
    }

    void myPackagePrivateMethod(){
        System.out.println("MyClass1: Package Private Method");
    }

    protected void myProtectedMethod(){
        System.out.println("MyClass1: Protected Method");
    }

    public void myPublicMethod(){
        System.out.println("MyClass1: Public Method");
    }

}
