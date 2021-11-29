public class method_01 {
    static void greet(String name)// Formal Arguments
    {
        System.out.println("Hello!" + name);
    }

    public static void main(String[] args) {
        greet("Ali");// Actual Parameters
        greet("Omar");
    }
}
