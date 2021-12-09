package Trignomentry;

class Angles {
    private float Base;
    private float Hyp;
    private float Adj;

    public void setTriangle(float b, float h, float ad) {
        Base = b;
        Hyp = h;
        Adj = ad;
    }

    public void getTriangle() {
        System.out.println("  Hyp:" + Hyp + "Base:" + Base + "Adjacent:" + Adj);
    }
}

public class Trignomentry_01 {
    public static void main(String[] args) {

    }
}
