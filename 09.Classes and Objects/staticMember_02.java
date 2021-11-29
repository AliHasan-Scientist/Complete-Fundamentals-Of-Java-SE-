class First {
    int num;
    static int snum;// static member variable
    private static String name = "Ali";
    // instance member funtion

    public void setNum(int n) {
        num = n;

    }

    public static void greet() {
        System.out.println("Hello~");
        snum = 45;
    }

    public static String number() {
        return name = "String";
    }

    // Nested Static Class
    public static class inner {
        public static String name = "Ali Hasan";
    }
}

public class staticMember_02 {
    public static void main(String[] args) {

        System.out.println(First.snum);
        System.out.println(First.inner.name);
    }
}
