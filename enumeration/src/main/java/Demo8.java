public class Demo8 {
    /* abstract */ enum MyEnum{
        CONSTANT1{
            @Override
            void print() {
                System.out.println("CONSTANT1");
            }
        },
        CONSTANT2(){
            @Override
            void print() {
                System.out.println("CONSTANT2");
            }
        };
        abstract void print();
    }
}
