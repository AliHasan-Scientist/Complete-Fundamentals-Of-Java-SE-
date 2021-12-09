class A {
    public A() {
        System.out.println("Constructor A1  ");
    }
}

class B extends A {
    public B() {
        this(0);
        System.out.println("Constructor B1 ");
    }

    public B(int k) {

        System.out.println("Constructor B2:" + k);
    }
}

public class constructorChaining {
    public static void main(String[] args) {
        B o1 = new B();
    }
}
