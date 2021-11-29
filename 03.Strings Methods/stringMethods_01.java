public class stringMethods_01 {
    public static void main(String[] args) {
        String text = "Pakistan always grow day and night";
        String text2 = "No doubt Allah helps the my country pakistan";
        // String Method

        System.out.println("the lenght of text is :" + text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("always"));
        System.out.println(text);
        // String Concatination
        System.out.println(text + "." + text2);
        System.out.println(text.concat(text2));
        System.out.println(text2.replace("No doubt", "Inshallah"));
    }
}
