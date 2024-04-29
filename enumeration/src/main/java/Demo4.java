public class Demo4 {

    public static void main(String[] args) {
        // new MyEnum();
        MyEnum x = MyEnum.CONSTANT1;
        MyEnum y = MyEnum.CONSTANT2;
    }

    enum MyEnum{
        CONSTANT1(5), CONSTANT2(10);
        MyEnum(int x){
            // super(); // <- You can't define the super constructor invocation
        }
    }

    enum MyEnum2{
        CONSTANT1(), CONSTANT2();
    }
}
