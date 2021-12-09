import java.util.HexFormat;

import javax.management.monitor.GaugeMonitor;

class Test {
    Integer x;

    public static int setValue(int x) {
       return this.x = x;
    }
}

public class this_02 {
    public static void main(String[] args) {
        Test o1 = new Test();
        System.out.println(o1.setValue(2));
    }
    
}
