package lsp_rule;

public class AppInitializer {
    public static void main(String[] args) {
        /* byte < int */
        byte b = 10;
        int x1 = 10 /* (int) = (int) */;
        int x2 = b; /* (int) = (byte) */

        /* S < T */
        T t1 = new T();
        T t2 = new S();

        /* T < Object */
        Object o1 = new T();
        Object o2 = new S();
    }
}

class T {
}

class S extends T {
}


