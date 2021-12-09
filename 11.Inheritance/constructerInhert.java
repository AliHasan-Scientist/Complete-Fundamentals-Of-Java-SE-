class A {
    int a;

    public A(int x) {
        a = x;
        System.out.println("Constructer A");

    }
}

class B extends A {

    public B() {
        super(2);

    }

}

public class constructerInhert {
    public static void main(String[] args) {
        B oi = new B();
        System.out.println(oi.a);
        ;
    }
}
