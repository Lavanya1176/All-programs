package demoproject;

import studentsystem.main;

public class second {
    public static void main(String[] args) {
        first obj1 = new first();
        System.out.println(obj1.getNum());
        obj1.setNum(50);
        System.out.println(obj1.getNum());
        // System.out.println(obj1.square(12));
    }
}
