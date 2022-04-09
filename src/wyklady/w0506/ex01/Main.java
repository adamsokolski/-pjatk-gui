package wyklady.w0506.ex01;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("Method #1");
            }
        };

        myInterface.method();

        myInterface = () -> System.out.println("Method #2");
        myInterface.method();

        fun(myInterface);
        fun(() -> System.out.println("Method #3"));

        System.out.println("\n-----1-----\n");

        func( str -> str.length() );

        func(str -> {
            int res = 0;
            for(char ch : str.toCharArray())
                if(ch >= 'A' && ch <= 'Z')
                    res++;
            return res;
        });

        func( str -> countCaps(str));
        func(Main::countCaps);

    }

    public static Integer countCaps(String str) {
        int res = 0;
        for(char ch : str.toCharArray())
            if(ch >= 'A' && ch <= 'Z')
                res++;
        return res;
    }

    public static void fun (MyInterface myInterface) {
        myInterface.method();
    }

    public static void func(Function<String, Integer> f) {
        System.out.println(f.apply("Ala"));
    }
}
