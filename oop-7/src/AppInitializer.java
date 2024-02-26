public class AppInitializer {

    static int getValue(int x){
        System.out.println("getValue()");
        return x + a;
    }
    int x = 10;
    static int a = 20;
    static{
        System.out.println("B is about to initialize a:" + a);
    }
    {
        System.out.println(x);
    }
    static int b = getValue(a);
    static{
        System.out.println("B has been just initialized b:" + b);
    }
    public static void main(String[] args) {
        System.out.println("Main Method()");
    }
}
