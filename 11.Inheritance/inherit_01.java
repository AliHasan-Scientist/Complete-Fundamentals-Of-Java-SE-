import javax.swing.plaf.synth.SynthScrollBarUI;

/**
 * inherit_01
 */
// Custom Class
class myClass {
    // Initialization Block;
    Integer a;
    String name;
    {
        System.out.println("Intitialization Block" + a);
        a = 5;

    }

    public myClass() {
        System.out.println("This is constructor");
    }

}

public class inherit_01 {
    public static void main(String[] args) {
        myClass entity1 = new myClass();

    }
}