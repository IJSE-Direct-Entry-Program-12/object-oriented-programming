public class AppInitializer {
    static int a = 10;

    static {
        int x = 20;
        //String a = "ijse";
        System.out.println(x);
        System.out.println("a:" + a);
        // System.out.println(b); // <- Illegal forward reference according to the forward referencing rule
    }

    static int b;

    static {
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(a);
        System.out.println(b);
        //System.out.println(x);
    }
}
