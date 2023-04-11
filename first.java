package demoproject;

public class first {
    private double num = 100;

    private boolean square() {
        return true;
    }

    public boolean getNum() {
        return square();
    }

    public void setNum(double num) {
        this.num = num;
    }

    public static void main(String args[]) {

        first obj = new first();
        System.out.println(obj.num);
        System.out.println(obj.square(1000));
    }
}
