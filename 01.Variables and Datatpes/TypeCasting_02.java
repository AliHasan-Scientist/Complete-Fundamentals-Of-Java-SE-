/**
 * TypeCasting_02
 */
public class TypeCasting_02 {

    public static void main(String[] args) {
        /*
         * Type Casting? There are two types of type casting? 1.Widening
         * Casting(Automatically) i.e#byte -> short -> char -> int -> long -> float ->
         * double 2.Narrowing Casting (Manually)
         i.e# (int)VarName.
         */
        // Widening Casting;
        int num = 123;
        float fnum = num;
        float i = 87.5f;
        double j = i;
        System.out.println("Widening Casting:" + fnum);
        // Narrowing Casting;
        System.out.println("Narrowing Casting:" + (float) num);
        System.out.println(j);
    }
}