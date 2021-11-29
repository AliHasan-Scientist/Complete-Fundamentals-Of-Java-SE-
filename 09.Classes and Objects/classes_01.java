//Box class
class Box {
    int width;//instance member variables
    int bridth;
    int hight;

    // Member function
    public void setDimensions(int w, int b, int h) {
        width = w;
        bridth = b;
        hight = h;
    }

    public void showDimensions() {
        System.out.println("Width" + width);
        System.out.println("Bridth:" + bridth);
        System.out.println("Hight:" + hight);
    }
}

public class classes_01 {
    public static void main(String[] args) {
        Box box1 = new Box();// an object instance in which box class store in box1 object
        box1.setDimensions(2, 3, 5);
        box1.showDimensions();
    }
}
