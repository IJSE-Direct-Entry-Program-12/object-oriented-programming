public class Demo {
    private static int myInt = 10;
    private static long myLong = InnerClass.myLong;

    private static class InnerClass {
        private static long myLong = 20;
        private static int myInt = Demo.myInt;
    }
}
