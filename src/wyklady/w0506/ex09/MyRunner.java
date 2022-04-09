package wyklady.w0506.ex09;

public class MyRunner extends Thread{
    private char chr;

    private static Object objS = new Object();

    public MyRunner(char chr) {
        this.chr = chr;
    }

    @Override
    public void run() {
        synchronized (objS) {
            for (int i = 0; i < 3; i++) {
                System.out.print(chr);
            }
        }
    }
}
