package L16_statics;

public class StaticPractice {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 30;
        t1.y = 50;
        t1.show();

        Test t2 = new Test();
        t2.show();
    }
}

class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x + " " + y);
    }

    static void display() {
        System.out.println(x);
    }
}
