package oops.inheritance;

// Parent class
class A {
    void showA() {
        System.out.println("Class A");
    }
}

// Interface 1
interface B {
    void showB();
}

// Interface 2
interface C {
    void showC();
}

// Child class (Hybrid Inheritance)
class D extends A implements B, C {

    public void showB() {
        System.out.println("Interface B");
    }

    public void showC() {
        System.out.println("Interface C");
    }

    void showD() {
        System.out.println("Class D");
    }
}

public class hybridlevel {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}
