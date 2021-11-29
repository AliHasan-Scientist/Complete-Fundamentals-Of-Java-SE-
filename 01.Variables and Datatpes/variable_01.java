public class variable_01 {
    public static void main(String[] args) {
        /**
         * What is Literal? A constant value which is assigned to varable is knowns as
         * literal contant i.e -> string literal ,float literal
         **/
        String msg = "Hello java jdk";
        int inum = 123;// takes 4 bytes
        float fnum = 1.3f;// takes 4 bytes in memory also add prefix f because by default is doubles
                          // types;
        double rnum = 1.333333d;
        short sinum = 13;
        long lnum = 123456789L;
        char chrater = 'A';// takes 2 byte and support unicode
        byte age = 19;// takes one byte in memory
        boolean log = true;
        // Scientific Numbers
        float base = 20e2f;

        System.out.println("String type:" + msg);
        System.out.println("Int type:" + inum);
        System.out.println(fnum);
        System.out.println(sinum);
        System.out.println(lnum);
        System.out.println(chrater);
        System.out.println(age);
        System.out.println(log);
        System.out.println(base);

    }
}
