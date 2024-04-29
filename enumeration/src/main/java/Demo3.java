public class Demo3 {

    /* Although you can't extend enums, you still can implement interfaces */

    interface MyInterface{
        void myMethod();
    }

    enum MyEnum implements MyInterface{
        CONSTANT1, CONSTANT2
        ; // <- You need to add this semicolon after constants if you are going to declare any members

        @Override
        public void myMethod() {}
    }

    enum MyEnum2{
        CONSTANT;
        void doSomething(){}
    }

    enum MyEnum3{}
}
