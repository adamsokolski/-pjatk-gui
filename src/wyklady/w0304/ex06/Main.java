package wyklady.w0304.ex06;

public class Main {
    public static void main(String[] args) {
        FuncInterface fi = () -> {
            System.out.println("Hello!");
        };
        fi.method();

        //=======================

        FIA fia = (e, f) -> {
            System.out.println(e+f);
        };
        fia.method(2,3);



        FIB fib = (g, h) -> {
            return g > h;
        };
        fib = (g, h) -> g > h;

        System.out.println(
            "Wynik: " + fib.method(2,3)
        );
    }
}
