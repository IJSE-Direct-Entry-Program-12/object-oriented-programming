public class AppInitializer {
    static { System.out.println("Static Initializer 1"); }
    { System.out.println("Instance Initializer 1"); }
    static { System.out.println("Static Initializer 2");}
    { System.out.println("Instance Initializer 2"); }
    public AppInitializer() {
        System.out.println("Constructor");
    }

    public void finalize(){
        System.out.println("Budu ammo menna moo maawa adagana yanna hadanoo...!");
    }

    public static void main(String[] args) {
        System.out.println("Main()");
        AppInitializer a1 = new AppInitializer();
        new AppInitializer();
        a1 = null;
        System.gc();
    }
}


