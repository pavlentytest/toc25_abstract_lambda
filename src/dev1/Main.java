package dev1;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        Circle circle = new Circle();

        Shape shape2 = new Shape() {
            @Override
            void square() {
                // логика 1
            }

            @Override
            void toDo() {

            }
        };
        shape2.square();
        shape2.test();
        shape2.toDo();
    }
}

abstract class Shape {
    abstract void square();
    abstract void toDo();
    void test() {

    }
}
class Circle extends Shape {

    @Override
    void toDo() {
        System.out.println("ToDo!");
    }

    @Override
    void square() {
        System.out.println("Squire of circle!");
    }
}