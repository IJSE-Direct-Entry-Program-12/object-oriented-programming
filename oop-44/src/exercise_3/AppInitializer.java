package exercise_3;

public class AppInitializer extends B{
    public AppInitializer(int x) {
        this(x++, x);
        System.out.println("Constructor1");
    }
    public AppInitializer(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        System.out.println("Constructor2");
    }
    public AppInitializer() {
        this(10);
        System.out.println("Constructor3");
    }
    public static void main(String[] args) {
        AppInitializer a1;
        AppInitializer a2;
        (a1 = new AppInitializer(5)).y = (a2 = new AppInitializer()).y;
        System.out.println(a1.x);
        System.out.println(a2.x);
        System.out.println(a1.y);
        System.out.println(a2.y);
    }
}

class B{
    int x;
    static int y;
}
