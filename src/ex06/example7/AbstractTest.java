package ex06.example7;

abstract class Shape {
    int x, y;

    public void translate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();
};

class Rectangle extends Shape {
    int width, height;

    @Override
    public void draw() {
        System.out.println("사각형 그리기 메서드");
    }
};

class Circle extends Shape {
    int radius;

    @Override
    public void draw() {
        System.out.println("원 그리기 메서드");
    }
};

public class AbstractTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.draw();
        s2.draw();
    }
}
