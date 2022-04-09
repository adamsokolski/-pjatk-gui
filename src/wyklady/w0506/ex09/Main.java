package wyklady.w0506.ex09;

public class Main {
    public static void main(String[] args) {
        new MyRunner('!').start();
        new MyRunner('@').start();
        new MyRunner('#').start();


        Thread t = new MyRunner('$');
        t.start();
        t.interrupt();


    }
}
