import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class LogicalOp_03 {
    public static void main(String[] args) {
        /**
         * 
         *
        
         * 
         */
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        // And Operator returns true if both conditions are true
        boolean and1 = a & b;
        boolean and2 = a & c;
        // Or Operator returns true if one condition is true
        boolean or1 = a | c;
        boolean or2 = d | c;
        // Not Operator reverse the resutl it return false if the condition is true and vice versa
        boolean not1 = !(a | c);
        boolean not2 = !(d | c);

        System.out.println(and1);
        System.out.println(and2);
        System.out.println("_____________________________");

        System.out.println(or1);
        System.out.println(or2);
        System.out.println("_____________________________");
        System.out.println(not1);
        System.out.println(not2);

    }

}
