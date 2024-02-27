public class AppInitializer {
    static {
        System.out.println("Static");
    }
    public static void main(String[] args) {
        System.out.println("main()");
        new AppInitializer(5);
        System.out.println(new AppInitializer(30).y);
    }
    int y = 20;
    {
        System.out.println("Instance");
        System.out.println(y);
        System.out.println(x = y);
    }
    public AppInitializer(int y) {
        this.y = y;
    }
    static int x = 10;
}
