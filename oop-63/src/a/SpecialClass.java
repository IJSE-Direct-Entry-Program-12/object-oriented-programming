package a;

import b.MyClass;

public sealed class SpecialClass permits MyClass{
}

//final class MyClass extends SpecialClass{}