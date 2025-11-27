class A {
    A() {
        System.out.println("Конструктор класса A");
    }
}
class B extends A {
    B() {
        System.out.println("Конструктор класса B");
    }
}
class C extends B {
    C() {
        System.out.println("Конструктор класса C");
    }
}
C c = new C();