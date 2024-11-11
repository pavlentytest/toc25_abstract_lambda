package dev3;

public class Main {
    public static void main(String[] args) {

        Calculable calc = new Calculable();
        Calculable calc2 = new Calculable() {
            @Override
            public int calculate(int a, int b) {
                return 100*(a+b);
            }
        };
        calc2.calculate(40,50);
        Calculable calc3 = (a, b) -> {
            int sum = a+b;
            return 200*(sum-a);
        };

    }
}
// интерфейс из одного метода называется функциональным
interface Calculable {
    int calculate(int a, int b);
}
