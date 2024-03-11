public class AppInitializer {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println("------------------");

//        Cat c = new Cat();
//        System.out.println(c instanceof Dog);

        Animal a = new Cat();
        System.out.println(a instanceof Dog);
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
