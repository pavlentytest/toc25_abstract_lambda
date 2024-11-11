package dev2;

public class Program {
    public static void main(String[] args) {

        Switchable switchable = new Switchable();
        Lamp led = new Lamp();
        Lamp led2 = new Lamp();

        Switchable switchable2 = new Soundable() {
            @Override
            public void play() {

            }

            @Override
            public void switchOn() {

            }

            @Override
            public void switchOff() {

            }
        };
    }
}
interface Switchable {
    void switchOn();
    void switchOff();
}
interface Soundable extends Switchable {
    void play();
}
abstract class Test {
    abstract void ttt();
}

class Lamp extends Test implements Soundable {


    @Override
    public void play() {

    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    void ttt() {

    }
}
